package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Cblood;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.CbloodServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author zyqfz
 * @date 2019/9/26 - 15:30
 */
@Api(tags = "献血通知信息")
@RestController
public class CbloodController {

    @Autowired
    CbloodServiceImpl cbloodServiceImpl;


    @ApiOperation(value = "添加献血通知信息")
    @PostMapping("/doctor/addCblood")
    public Msg addCblood(Cblood cblood)
    {
        //活动状态
        cblood.setCstate(1);
        //活动创建时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        cblood.setCdate(dateString);
        int cid = cbloodServiceImpl.addCblood(cblood);
        return Msg.success();
    }
}
