package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Gift;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.GiftServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
