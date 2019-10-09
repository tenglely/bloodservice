package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Gift;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.GiftServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * //献血物资控制器
 * @author zyqfz
 * @date 2019/9/26 - 16:03
 */
@Api(tags = "献血物资")
@RestController
public class GiftController {

    @Autowired
    GiftServiceImpl giftServiceimpl;

    @ApiOperation(value = "添加献血物资")
    @PostMapping("/doctor/addGift")
    public Msg addGift(Gift gift){
     int gid =  giftServiceimpl.addGift(gift);
       return Msg.success();
    }

    @ApiOperation(value = "管理员或医务人员根据lid查询所有物资信息")
    @GetMapping("/doctor/findgiftbylid/{lid}")
    public Msg findgiftbylid(@PathVariable("lid")Integer lid){
        List<Gift> list=giftServiceimpl.selectbylid(lid);
        return Msg.success().add("list",list);
    }

    @ApiOperation(value = "查看献血物资,分页显示,一页10条数据")
    @GetMapping("/doctor/selectGift/{pn}")
    public Msg selectGift(@PathVariable("pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<Gift> list =  giftServiceimpl.selectGift();
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("pageinfo",pageInfo);
    }

}
