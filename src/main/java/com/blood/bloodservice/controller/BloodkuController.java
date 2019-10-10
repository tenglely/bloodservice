package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Bloodku;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.BloodkuServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 血液入库控制器
 * @author zyqfz
 * @date 2019/9/26 - 23:42
 */
@Api(tags = "血液入库信息")
@RestController
public class BloodkuController {
    @Autowired
    BloodkuServiceImpl bloodkuServiceImpl;

    @ApiOperation(value = "查询全部血液")
    @GetMapping("/doctor/selectbloodkuall/{pn}")
    public Msg selectblookuall(@PathVariable("pn") Integer pn){
        PageHelper.startPage(pn,10);
        List<Bloodku> list=bloodkuServiceImpl.selectall();
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("list",pageInfo);
    }
    
    @ApiOperation(value="根据血型查询血库信息")
    @GetMapping("/doctor/selectbloodkubybtype/{pn}/{btype}")
    public Msg selectBloodkuByBtype(@PathVariable("pn") Integer pn,@PathVariable("btype") String btype) {
    	PageHelper.startPage(pn,10);
    	List<Bloodku> list = bloodkuServiceImpl.selectByBtype(btype);
    	PageInfo pageInfo = new PageInfo(list, 5);
		return Msg.success().add("list", pageInfo);
    }

    @ApiOperation(value="根据使用状态state查询血库信息")
    @GetMapping("/doctor/selectbloodkubystate/{pn}/{state}")
    public Msg selectBloodKuByState(@PathVariable("pn")Integer pn, @PathVariable("state")Boolean state) {
    	PageHelper.startPage(pn,10);
    	List<Bloodku> list = bloodkuServiceImpl.selectByState(state);
    	PageInfo pageInfo = new PageInfo(list,5);
		return Msg.success().add("list", pageInfo);
    }
    @ApiOperation(value="根据是否入库bstate查询血库信息")
    @GetMapping("/doctor/selectbloodkubybstate/{pn}/{bstate}")
    public Msg selectBloodKuByBstate(@PathVariable("pn")Integer pn,@PathVariable("bstate")Integer bstate) {
    	PageHelper.startPage(pn,10);
    	List<Bloodku> list = bloodkuServiceImpl.selectByBstate(bstate);
    	PageInfo pageInfo = new PageInfo(list,5);
		return Msg.success().add("list", pageInfo);
    	
    }
    @ApiOperation(value="根据地址查询血库信息")
    @GetMapping("/doctor/selectbloodkubybaddress/{pn}/{baddressId}")
    public Msg selectBloodKuByBaddress(@PathVariable("pn")Integer pn,@PathVariable("baddressId")Integer baddressId) {
		PageHelper.startPage(pn,10);
		List<Bloodku> list = bloodkuServiceImpl.selectByBaddress(baddressId);
		PageInfo pageInfo = new PageInfo(list,5);
    	return Msg.success().add("list", pageInfo);
    	
    }
    @ApiOperation(value = "添加血库信息")
    @PostMapping("/doctor/addBloodku")
    public Msg addBloodku(Bloodku bloodku){
        //添加使用状态
        bloodku.setState(false);
        //设置入库时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        bloodku.setInputdate(dateString);
       int bid= bloodkuServiceImpl.addBloodku(bloodku);

       return Msg.success();
    }
    
}
