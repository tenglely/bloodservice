package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.*;
import com.blood.bloodservice.service.impl.CheckAgainServiceImpl;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.blood.bloodservice.service.impl.PeopleServiceImpl;
import com.blood.bloodservice.service.impl.SendbloodServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

/**
 * 二次检测结果控制器
 * @author zyqfz
 * @date 2019/9/27 - 0:00
 */
@Api(tags = "二次检测结果信息")
@RestController
public class CheckAgainController {
    @Autowired
    CheckAgainServiceImpl checkAgainServiceImpl;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    PeopleServiceImpl peopleServiceImpl;
    @Autowired
    DoctorServiceImpl doctorServiceImpl;
    @Autowired
    SendbloodServiceImpl sendbloodService;

    @ApiOperation(value = "添加二次检测结果,需医务人员登录")
    @PostMapping("/doctor/addCheckAgain")
    public Msg addCheckAgain(Checkagain checkagain){
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        checkagain.setYid(userlogin.getUid());
        int cid = checkAgainServiceImpl.addCheckAgain(checkagain);
        if(cid>0){
            People people=peopleServiceImpl.selectonebyid(checkagain.getUid());
            redisTemplate.opsForList().remove("sendblood_people",1,people);
            System.out.println("从redis的sendblood移除people成功!!");
            Sendblood sendblood=sendbloodService.selectonbybid(checkagain.getBid());
            redisTemplate.opsForList().remove("sendblood_list",1,sendblood);
            System.out.println("从redis的sendblood_list移除sendblood成功!!");
            Doctor doctor=doctorServiceImpl.selectbydid(checkagain.getYid());
            redisTemplate.opsForList().remove("sendblood_doctor",1,doctor);
            System.out.println("从redis的sendblood_doctor移除doctor成功!!");
            if(checkagain.getCstate()){
                checkagain.setCid(cid);
                redisTemplate.opsForList().leftPush("checkagain",checkagain);
                redisTemplate.opsForList().leftPush("checkagain_sendblood",sendblood);
                redisTemplate.opsForList().leftPush("checkagain_people",people);
                redisTemplate.opsForList().leftPush("checkagain_doctor",doctor);
            }
            String message="医务人员"+userlogin.getUid()+"：把编号"+people.getUid()+" 姓名为"+people.getUname()+"的用户，添加了血液复测结果";
            redisTemplate.opsForList().leftPush("newlist",message);
        }
        return Msg.success();
    }

//    @GetMapping("/doctor/testremove")
//    public Msg testremove(){
//        Checkagain checkagain=checkAgainServiceImpl.selectOnecheckagain(4);
//        redisTemplate.opsForList().remove("checkagain",1,checkagain);
//        return Msg.success();
//    }

    @ApiOperation(value = "输出复检成功的列表,数据有：复测结果，献血记录，用户，医生")
    @GetMapping("/doctor/findCheckagainlist")
    public Msg findCheckresultSuccessPeople(){
        int length = redisTemplate.opsForList().size("checkagain").intValue();
        List<Checkagain> clist=redisTemplate.opsForList().range("checkagain",0,length);
        List<Checkagain> slist=redisTemplate.opsForList().range("checkagain_sendblood",0,length);
        List<Checkagain> plist=redisTemplate.opsForList().range("checkagain_people",0,length);
        List<Checkagain> dlist=redisTemplate.opsForList().range("checkagain_doctor",0,length);
        return Msg.success().add("clist",clist).add("slist",slist).add("plist",plist).add("dlist",dlist);
    }

    @ApiOperation(value = "查询二次检测结果,分页一页10条数据")
    @GetMapping("/doctor/selectCheckagain/{pn}")
    public Msg selectCheckagain(@PathVariable("pn")Integer pn){

        PageHelper.startPage(pn,10);
        List<Checkagain> list = checkAgainServiceImpl.selectCheckagain();
        List<People> listPeople = new ArrayList<>();
        List<Doctor> listDoctor = new ArrayList<>();
        for(Checkagain c : list){
            People people = peopleServiceImpl.selectonebyid(c.getUid());
            Doctor doctor = doctorServiceImpl.selectbydid(c.getYid());
            listPeople.add(people);
            listDoctor.add(doctor);
        }
        PageInfo pageInfo = new PageInfo(list,5);
       // System.out.println(pageInfo);
        return Msg.success().add("pageinfo",pageInfo).add("listpeoplename",listPeople).add("listdoctorname",listDoctor);
    }

    @ApiOperation(value = "根据cid查询二次检测结果详细信息")
    @GetMapping("/doctor/selectOneCheckagain/{cid}")
    public Msg selectOneCheckagain(@PathVariable("cid")Integer cid){
        Checkagain c = checkAgainServiceImpl.selectOnecheckagain(cid);
        //查询出献血人员的名字和医护人员的名字
        People people = peopleServiceImpl.selectonebyid(c.getUid());
        Doctor doctor = doctorServiceImpl.selectbydid(c.getYid());

        // System.out.println(pageInfo);
        return Msg.success().add("checkagain",c).add("people",people).add("doctor",doctor);
    }

    @ApiOperation(value = "复查结果状态cstate查询二次检测结果,分页一页10条数据")
    @GetMapping("/doctor/selectCheckagain/{pn}/{cstate}")
    public Msg selectCheckagain(@PathVariable("pn")Integer pn,@PathVariable("cstate")Boolean cstate){

        PageHelper.startPage(pn,10);
        List<Checkagain> list = checkAgainServiceImpl.selectCheckagainBycstate(cstate);
        List<People> listPeople = new ArrayList<>();
        List<Doctor> listDoctor = new ArrayList<>();
        for(Checkagain c : list){
            People people = peopleServiceImpl.selectonebyid(c.getUid());
            Doctor doctor = doctorServiceImpl.selectbydid(c.getYid());
            listPeople.add(people);
            listDoctor.add(doctor);
        }
        PageInfo pageInfo = new PageInfo(list,5);
        // System.out.println(pageInfo);
        return Msg.success().add("pageinfo",pageInfo).add("listpeoplename",listPeople).add("listdoctorname",listDoctor);
    }
}
