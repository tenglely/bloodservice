package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Inform;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.InformServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *信息添加
 * @author zyqfz
 * @date 2019/9/27 - 8:56
 */
@Api(tags = "信息通知接口")
@RestController
public class InformController {
    @Autowired
    InformServiceImpl informServiceImpl;

    @ApiOperation(value = "添加通知信息" ,notes = "添加inform对象信息")
    @PostMapping("/use/addInform")
    public Msg addInform(Inform inform){

        //设置时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        inform.setSenddate(dateString);
        int id = informServiceImpl.addInform(inform);
        return Msg.success();

    }

}
