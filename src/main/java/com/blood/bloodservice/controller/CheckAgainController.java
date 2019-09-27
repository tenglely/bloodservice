package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Checkagain;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.CheckAgainServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 二次检测结果控制器
 * @author zyqfz
 * @date 2019/9/27 - 0:00
 */
@Api(tags = "二次检测结果信息")
@RestController
public class CheckAgainController {
    @Autowired
    CheckAgainServiceImpl checkAgainServiceImpl;

    @ApiOperation(value = "添加二次检测结果")
    @PostMapping("/doctor/addCheckAgain")
    public Msg addCheckAgain(Checkagain checkagain){
        int cid = checkAgainServiceImpl.addCheckAgain(checkagain);
        return Msg.success();
    }
}
