package com.blood.bloodservice.controller;

import com.blood.bloodservice.config.EmailUtil;
import com.blood.bloodservice.entity.*;
import com.blood.bloodservice.service.impl.CheckresultServiceImpl;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.blood.bloodservice.service.impl.PeopleServiceImpl;
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

import java.util.ArrayList;
import java.util.List;

/**
 * 体检结果控制器
 * @author zyqfz
 * @date 2019/9/26 - 17:04
 */
@Api(tags = "体检结果信息")
@RestController
public class CheckresultController {

    @Autowired
    CheckresultServiceImpl checkresultServiceImpl;
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    PeopleServiceImpl peopleServiceImpl;
    @Autowired
    DoctorServiceImpl doctorServiceImpl;

    @ApiOperation(value = "添加体检结果,需医务人员登录")
    @PostMapping("/doctor/addCheckresult")
    public Msg addCheckresult(Checkresult checkresult){
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        checkresult.setYid(userlogin.getUid());
        int id = checkresultServiceImpl.addCheckresult(checkresult);
        if(id>0) {
            if(checkresult.getCstate()){
                People people=peopleServiceImpl.selectonebyid(checkresult.getUid());
                redisTemplate.opsForList().leftPush("checkresult_people",people);
                System.out.println("redis放入成功!!");
                String message="医务人员"+userlogin.getUid()+"：把编号"+people.getUid()+" 姓名为"+people.getUname()+"的用户，添加了体检结果";
                redisTemplate.opsForList().leftPush("newlist",message);
                //发送邮件
                String result="体检不通过";
                if(checkresult.getCstate())
                    result="体检通过";
                String title=people.getUname()+"献血体检结果单";
                String msg="姓名:"+people.getUname()+"</br>"+
                        "性别:"+people.getUsex()+"</br>"+
                        "体重:"+checkresult.getWeight()+"公斤  （男50公斤>=/女 45公斤>=）</br>"+
                        "心率:"+checkresult.getBlv()+"/min  （60-100/min）</br>"+
                        "血压:"+checkresult.getBya()+"mmHg  (90-140/60-90mmHg)</br>"+
                        "血型:"+checkresult.getBtype()+"</br>"+
                        "血红蛋白:"+checkresult.getBdan()+"  (110-150)</br>"+
                        "乙肝:"+checkresult.getByi()+"  (阴性 true/阳性 false)</br>"+
                        "转氨酶:"+checkresult.getBmei()+"  (<50)</br>"+
                        "体检结果:"+result+"</br>"+
                        "体检时间:"+checkresult.getCtime()+"</br>";
                EmailUtil emailUtil=new EmailUtil();
                emailUtil.sendEamilCode(people.getUemail(),title,msg);
            }
        }
       return Msg.success();
    }

    @ApiOperation(value = "输出体检成功的人员列表")
    @GetMapping("/doctor/findCheckresultSuccessPeople")
    public Msg findCheckresultSuccessPeople(){
        int length = redisTemplate.opsForList().size("checkresult_people").intValue();
        List<People> list=redisTemplate.opsForList().range("checkresult_people",0,length);
        for(People people:list)
            System.out.println(people);
        return Msg.success().add("list",list);
    }

    @ApiOperation(value = "查询体检结果,分页一页10条数据")
    @GetMapping("/doctor/selectCheckresult/{pn}")
    public Msg selectCheckresult(@PathVariable("pn")Integer pn){

        PageHelper.startPage(pn,10);
        List<Checkresult> list = checkresultServiceImpl.selectCheckresult();
        List<String> listPeoplename = new ArrayList<>();
        List<String> listDoctorname = new ArrayList<>();
        for(Checkresult c : list){
            People people = peopleServiceImpl.selectonebyid(c.getUid());
            Doctor doctor = doctorServiceImpl.selectbydid(c.getYid());
            listPeoplename.add(people.getUname());
            listDoctorname.add(doctor.getDname());
        }
        PageInfo pageInfo = new PageInfo(list,5);
        //System.out.println(pageInfo);
        return Msg.success().add("pageinfo",pageInfo).add("listpeoplename",listPeoplename).add("listdoctorname",listDoctorname);
    }

    @ApiOperation(value = "根据id查询检测结果详细信息")
    @GetMapping("/doctor/selectOneCheckresult/{id}")
    public Msg selectOneCheckresult(@PathVariable("id")Integer id){
        Checkresult c = checkresultServiceImpl.selectOneCheckresult(id);
        //查询出献血人员的名字和医护人员的名字
        People people = peopleServiceImpl.selectonebyid(c.getUid());
        Doctor doctor = doctorServiceImpl.selectbydid(c.getYid());
        // System.out.println(pageInfo);
        return Msg.success().add("checkresult",c).add("people",people).add("doctor",doctor);
    }

    @ApiOperation(value = "根据检查结果状态cstate查询体检结果,分页一页10条数据，返回体检结果，用户信息，医生信息")
    @GetMapping("/doctor/selectCheckresultBycstate/{pn}/{cstate}")
    public Msg selectCheckresultBycstate(@PathVariable("cstate")Boolean cstate,@PathVariable("pn")Integer pn){

        PageHelper.startPage(pn,10);
        List<Checkresult> list = checkresultServiceImpl.selectCheckresultBycstate(cstate);
        List<String> listPeoplename = new ArrayList<>();
        List<String> listDoctorname = new ArrayList<>();
        for(Checkresult c : list){
            People people = peopleServiceImpl.selectonebyid(c.getUid());
            Doctor doctor = doctorServiceImpl.selectbydid(c.getYid());
            listPeoplename.add(people.getUname());
            listDoctorname.add(doctor.getDname());
        }
        PageInfo pageInfo = new PageInfo(list,5);
        //System.out.println(pageInfo);
        return Msg.success().add("pageinfo",pageInfo).add("listpeoplename",listPeoplename).add("listdoctorname",listDoctorname);
    }
}
