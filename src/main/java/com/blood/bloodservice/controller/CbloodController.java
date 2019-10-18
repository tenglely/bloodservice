package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.*;
import com.blood.bloodservice.service.impl.BloodaddressServiceImpl;
import com.blood.bloodservice.service.impl.CbloodServiceImpl;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.blood.bloodservice.service.impl.GiftServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author zyqfz
 * @date 2019/9/26 - 15:30
 */
@Api(tags = "献血活动信息接口")
@RestController
public class CbloodController {

    @Autowired
    CbloodServiceImpl cbloodServiceImpl;
    @Autowired
    BloodaddressServiceImpl bloodaddressService;
    @Autowired
    DoctorServiceImpl doctorService;
    @Autowired
    GiftServiceImpl getGiftServiceImpl;

    @Autowired
    GiftServiceImpl giftServiceImpl;

    @ApiOperation(value = "管理员审核活动，修改活动状态为1")
    @GetMapping("/admin/updatecblood/{cid}")
    public Msg updatecblood(@PathVariable("cid") Integer cid){
        int i=cbloodServiceImpl.updatecstate(cid);
        if(i>0)
            return Msg.success();
        return Msg.fail();
    }

    @ApiOperation(value = "添加献血通知信息，需医务人员登录")
    @PostMapping("/doctor/addCblood")
    public Msg addCblood(Cblood cblood,String[] types,String[] name,int[] number)
    {
        //设置医务人员编号
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        cblood.setUid(userlogin.getUid());
        //设置添加礼品表
        int lid = (int)(1+Math.random()*100000);
        for(int i=0; i<types.length;i++){
            Gift gift = new Gift();
            gift.setLtype(types[i]);
            gift.setLname(name[i]);
            gift.setLnumber(number[i]);
            gift.setLid(lid);
            giftServiceImpl.addGift(gift);
        }
        //活动状态
        cblood.setCstate(0);
        //设置礼品编号
        cblood.setLid(lid);
        //活动创建时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        cblood.setCtime(dateString);
        int cid = cbloodServiceImpl.addCblood(cblood);
        return Msg.success();
    }

    @ApiOperation(value = "查看处于活动中的献血活动")
    @GetMapping("/all/findcblooding/{pn}")
    public Msg findcblooding(@PathVariable("pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<Cblood> list=cbloodServiceImpl.selectall();
        PageInfo page = new PageInfo(list,5);
        return Msg.success().add("list",page);
    }

    @ApiOperation(value = "管理员查询所有献血活动")
    @GetMapping("/api/admin/findallcblood/{pn}")
    public Msg findallcblood(@PathVariable("pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<Cblood> list=cbloodServiceImpl.findallcblood();
        PageInfo page = new PageInfo(list,5);
        return Msg.success().add("list",page);
    }

    @ApiOperation(value = "医务人员查询自己医院的献血活动，需要医务人员登录")
    @GetMapping("/doctor/findcbloodbydoctor")
    public Msg findcbloodbydoctor(){
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Doctor doctor=doctorService.selectbydid(userlogin.getUid());
        Bloodaddress bloodaddress=bloodaddressService.selectbyaddress(doctor.getDwork());
        List<Cblood> list=cbloodServiceImpl.findbyaddress(bloodaddress.getBid());
        return Msg.success().add("list",list);
    }

    @ApiOperation(value = "查看一条活动详情，包括物资")
    @GetMapping("/all/findcbloodandgift/{cid}")
    public Msg findcbloodandgift(@PathVariable("cid") Integer cid){
        Cblood cblood=cbloodServiceImpl.findbycid(cid);
        List<Gift> glist=giftServiceImpl.selectbylid(cblood.getLid());
        return Msg.success().add("cblood",cblood).add("glist",glist);
    }

}
