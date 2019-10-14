package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.*;
import com.blood.bloodservice.service.impl.*;
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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 血液入库控制器
 * @author zyqfz
 * @date 2019/9/26 - 23:42
 */
@Api(tags = "血液入库信息")
@RestController
public class BloodkuController {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    BloodkuServiceImpl bloodkuServiceImpl;
    @Autowired
    CheckAgainServiceImpl checkAgainService;
    @Autowired
    SendbloodServiceImpl sendbloodService;
    @Autowired
    PeopleServiceImpl peopleService;
    @Autowired
    DoctorServiceImpl doctorService;

    @ApiOperation(value = "查询全部血液")
    @GetMapping("/doctor/selectbloodkuall/{pn}")
    public Msg selectblookuall(@PathVariable("pn") Integer pn){
        PageHelper.startPage(pn,10);
        List<Bloodku> list=bloodkuServiceImpl.selectall();
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("list",pageInfo);
    }
    
    @ApiOperation(value="根据血型查询血库信息")
    @GetMapping("/doctor/selectbloodkubybtype/{pn}/{btype}")
    public Msg selectBloodkuByBtype(@PathVariable("pn") Integer pn,@PathVariable("btype") String btype) {
    	PageHelper.startPage(pn,10);
    	List<Bloodku> list = bloodkuServiceImpl.selectByBtype(btype);
    	PageInfo pageInfo = new PageInfo(list, 5);
		return Msg.success().add("list", pageInfo);
    }

    @ApiOperation(value="根据使用状态state查询血库信息")
    @GetMapping("/doctor/selectbloodkubystate/{pn}/{state}")
    public Msg selectBloodKuByState(@PathVariable("pn")Integer pn, @PathVariable("state")Boolean state) {
    	PageHelper.startPage(pn,10);
    	List<Bloodku> list = bloodkuServiceImpl.selectByState(state);
    	PageInfo pageInfo = new PageInfo(list,5);
		return Msg.success().add("list", pageInfo);
    }
    @ApiOperation(value="根据是否入库bstate查询血库信息")
    @GetMapping("/doctor/selectbloodkubybstate/{pn}/{bstate}")
    public Msg selectBloodKuByBstate(@PathVariable("pn")Integer pn,@PathVariable("bstate")Integer bstate) {
    	PageHelper.startPage(pn,10);
    	List<Bloodku> list = bloodkuServiceImpl.selectByBstate(bstate);
    	PageInfo pageInfo = new PageInfo(list,5);
		return Msg.success().add("list", pageInfo);
    	
    }
    @ApiOperation(value="根据地址查询血库信息")
    @GetMapping("/doctor/selectbloodkubybaddress/{pn}/{baddressId}")
    public Msg selectBloodKuByBaddress(@PathVariable("pn")Integer pn,@PathVariable("baddressId")Integer baddressId) {
		PageHelper.startPage(pn,10);
		List<Bloodku> list = bloodkuServiceImpl.selectByBaddress(baddressId);
		PageInfo pageInfo = new PageInfo(list,5);
    	return Msg.success().add("list", pageInfo);
    	
    }
    @ApiOperation(value = "添加血库信息，需要医务人员登录")
    @PostMapping("/doctor/addBloodku")
    public Msg addBloodku(Bloodku bloodku){
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        bloodku.setYid(userlogin.getUid());
        //添加使用状态
        bloodku.setState(false);
        //设置入库时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        bloodku.setInputdate(dateString);
       int bid= bloodkuServiceImpl.addBloodku(bloodku);
       if(bid>0){
           Checkagain checkagain=checkAgainService.selectOnecheckagain(bloodku.getCid());
           People people=peopleService.selectonebyid(checkagain.getUid());
           Sendblood sendblood=sendbloodService.selectonbybid(checkagain.getBid());
           Doctor doctor=doctorService.selectbydid(checkagain.getYid());
           redisTemplate.opsForList().remove("checkagain",1,checkagain);
           redisTemplate.opsForList().remove("checkagain_people",1,people);
           redisTemplate.opsForList().remove("checkagain_sendblood",1,sendblood);
           redisTemplate.opsForList().remove("checkagain_doctor",1,doctor);
           String message="医务人员"+userlogin.getUid()+"：把献血记录编号为"+sendblood.getBid()+"进行了血液入库";
           redisTemplate.opsForList().leftPush("newlist",message);
       }

       return Msg.success();
    }
    
}
