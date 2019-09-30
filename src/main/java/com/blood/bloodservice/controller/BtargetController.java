package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Btarget;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.BtargetServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zyqfz
 * @date 2019/9/27 - 11:21
 */
@Api(tags = "检测指标信息")
@RestController
public class BtargetController {
    @Autowired
    BtargetServiceImpl btargetServiceImpl;

    @ApiOperation(value = "检测指标信息添加")
    @PostMapping("/doctor/addBtarget")
    public Msg addBtarget(Btarget btarget){
        int id = btargetServiceImpl.addBtarget(btarget);
        return Msg.success();
    }


    @ApiOperation(value = "查询指标信息")
    @PostMapping("/doctor/selectBtarget")
    public Msg selectBtarget(){
        List<Btarget> list = btargetServiceImpl.selectBtarget();
        return Msg.success().add("btarget",list);
    }

}
