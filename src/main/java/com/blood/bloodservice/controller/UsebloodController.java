package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Useblood;
import com.blood.bloodservice.service.impl.UsebloodServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 血液使用情况控制器
 * @author zyqfz
 * @date 2019/9/27 - 8:29
 */
@Api(tags = "血液使用情况")
@RestController
public class UsebloodController {
    @Autowired
    UsebloodServiceImpl usebloodServiceImpl;


    @ApiOperation(value = "添加血液使用情况")
    @PostMapping("/admin/appUseblood")
    public Msg addUseblood(Useblood useblood){

        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        useblood.setGdate(dateString);
        int id = usebloodServiceImpl.addUseblood(useblood);
        return Msg.success();
    }

}
