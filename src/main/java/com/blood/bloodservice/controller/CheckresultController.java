package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Checkresult;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.CheckresultServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @ApiOperation(value = "添加体检结果")
    @PostMapping("/doctor/addCheckresult")
    public Msg addCheckresult(Checkresult checkresult){


       int id = checkresultServiceImpl.addCheckresult(checkresult);
       return Msg.success();
    }
}
