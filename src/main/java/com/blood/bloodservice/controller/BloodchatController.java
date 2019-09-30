package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Bloodchat;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.BloodchatServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author zyqfz
 * @date 2019/9/29 - 15:02
 */
@Api(tags = "咨询表信息")
public class BloodchatController {
    @Autowired
    BloodchatServiceImpl bloodchatServiceImpl;

    @ApiOperation(value = "添加咨询表信息")
    @PostMapping("/doctor/addBloodchat")
    public Msg addBloodchat(Bloodchat bloodchat)
    {
        int id = bloodchatServiceImpl.addBloodchat(bloodchat);
        return Msg.success();
    }

    @ApiOperation(value = "查询咨询表信息,分页查询显示一页10条数据")
    @PostMapping("/doctor/selectBloodchat/{pn}")
    public Msg selectBloodchat(@PathParam("pn") Integer pn)
    {
        PageHelper.startPage(pn,10);
        List<Bloodchat> list = bloodchatServiceImpl.selectBloodchat();
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("pageinfo",pageInfo);
    }
}
