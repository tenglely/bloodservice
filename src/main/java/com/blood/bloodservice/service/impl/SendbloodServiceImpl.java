package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.config.EmailUtil;
import com.blood.bloodservice.dao.DoctorMapper;
import com.blood.bloodservice.dao.PeopleMapper;
import com.blood.bloodservice.dao.SendbloodMapper;
import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.People;
import com.blood.bloodservice.entity.Sendblood;
import com.blood.bloodservice.entity.SendbloodExample;
import com.blood.bloodservice.service.SendbloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *献血记录
 * @author zyqfz
 * @date 2019/9/26 - 17:34
 */
@Service
public class SendbloodServiceImpl implements SendbloodService {

    @Autowired
    SendbloodMapper sendbloodMapper;
    @Autowired
    PeopleMapper peopleMapper;
    @Autowired
    DoctorMapper doctorMapper;

    @Override
    public int addSendBlood(Sendblood sendblood) {

        sendbloodMapper.insert(sendblood);
        return sendblood.getBid();
    }

    @Override
    public List<Sendblood> selectall() {
        SendbloodExample sendbloodExample=new SendbloodExample();
        sendbloodExample.setOrderByClause("bid desc");
        List<Sendblood> list=sendbloodMapper.selectByExample(sendbloodExample);
        if(list.isEmpty())
            return null;
        return list;
    }

    @Override
    public List<Sendblood> selectbyyid(Integer yid) {
        SendbloodExample sendbloodExample=new SendbloodExample();
        sendbloodExample.setOrderByClause("bid desc");
        SendbloodExample.Criteria criteria=sendbloodExample.createCriteria();
        criteria.andYidEqualTo(yid);
        List<Sendblood> list=sendbloodMapper.selectByExample(sendbloodExample);
        if(list.isEmpty())
            return null;
        return list;
    }

    @Override
    public List<Sendblood> selectbyuid(Integer uid) {
        SendbloodExample sendbloodExample=new SendbloodExample();
        sendbloodExample.setOrderByClause("bid desc");
        SendbloodExample.Criteria criteria=sendbloodExample.createCriteria();
        criteria.andUidEqualTo(uid);
        List<Sendblood> list=sendbloodMapper.selectByExample(sendbloodExample);
        if(list.isEmpty())
            return null;
        return list;
    }

    @Override
    public Sendblood selectonbybid(Integer bid) {
        SendbloodExample sendbloodExample=new SendbloodExample();
        SendbloodExample.Criteria criteria=sendbloodExample.createCriteria();
        criteria.andBidEqualTo(bid);
        List<Sendblood> list=sendbloodMapper.selectByExample(sendbloodExample);
        if(list.isEmpty())
            return null;
        return list.get(0);
    }

    @Override
    public void sendEmail(Sendblood sendblood, People people, Doctor doctor) {
        String title="感谢您的献血，这是你的献血记录";
        String msg="亲爱的"+people.getUname()+",感谢您的献血。如下是您本次的献血记录：</br>"+
                "本次抽血:"+sendblood.getSbnumber()+"毫升</br>"+
                "抽血地址："+sendblood.getSbaddress()+"</br>"+
                "抽血执行人:"+sendblood.getSbpeople()+"</br>"+
                "献血时间:"+sendblood.getSbdate()+"</br>"+
                "ps:请不要忘了领取您的献血证和献血小礼物哦。</br>";
        EmailUtil emailUtil=new EmailUtil();
        emailUtil.sendEamilCode(people.getUemail(),title,msg);
    }


}
