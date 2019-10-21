package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.*;
import com.blood.bloodservice.service.impl.BloodaddressServiceImpl;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.blood.bloodservice.service.impl.RegisterServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "人员登记信息接口")
@RestController
public class RegisterController {

    @Autowired
    private RegisterServiceImpl registerService;
    @Autowired
    private DoctorServiceImpl doctorService;
    @Autowired
    private BloodaddressServiceImpl bloodaddressService;

    @ApiOperation(value = "根据年+月份(如,2019-09)，和地点(需要登录后拿到该数据)来查找登记信息及用户信息，分页：1页10条")
    @GetMapping("/doctor/selectRegisterByMonth/{month}/{pn}")
    public Msg selectbymonth(@PathVariable("month")String month,@PathVariable("pn") Integer pn){

        //获取用户登录信息
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //查询doctor信息
        Doctor doctor=doctorService.selectbydid(userlogin.getUid());
        //查询登记地址
        Bloodaddress bloodaddress=bloodaddressService.selectbyaddress(doctor.getDwork());
        //根据年+月份(如,2019-09)，和地点来查找登记信息及用户信息
        PageHelper.startPage(pn, 10);
        List<Register> list=registerService.selectbymonth(month,bloodaddress.getBid());
        PageInfo page = new PageInfo(list,5);
        if(list.isEmpty())
            return Msg.fail();

        return Msg.success().add("pageinfo",page);
    }

    @ApiOperation(value = "根据具体日期(如2019-09-30)，和地点(需要登录后拿到该数据)来查找登记信息及用户信息，分页：1页10条")
    @GetMapping("/doctor/selectRegisterByDate/{rdate}/{pn}")
    public Msg selectbydate(@PathVariable("rdate")String rdate,@PathVariable(value = "pn") Integer pn){
        //获取用户登录信息
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //查询doctor信息
        Doctor doctor=doctorService.selectbydid(userlogin.getUid());
        //查询登记地址
        Bloodaddress bloodaddress=bloodaddressService.selectbyaddress(doctor.getDwork());
        //根据具体日期和地点来查找登记信息及用户信息
        PageHelper.startPage(pn, 10);
        List<Register> list=registerService.selectbydate(rdate,bloodaddress.getBid());
        PageInfo page = new PageInfo(list,5);
        if(list.isEmpty())
            return Msg.fail();
        return Msg.success().add("pageinfo",page);
    }

}
