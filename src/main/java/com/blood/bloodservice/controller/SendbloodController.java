package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Sendblood;
import com.blood.bloodservice.service.impl.SendbloodServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 献血记录
 * @author zyqfz
 * @date 2019/9/26 - 17:36
 */
@Api(tags = "献血记录信息")
@RestController
public class SendbloodController {
    @Autowired
    SendbloodServiceImpl sendbloodServiceImpl;


    @ApiOperation(value = "添加献血记录信息")
    @PostMapping("/doctor/addSendblood")
    public Msg addSendblood(Sendblood sendblood)
    {
        int bid = sendbloodServiceImpl.addSendBlood(sendblood);
        return Msg.success();
    }
}
