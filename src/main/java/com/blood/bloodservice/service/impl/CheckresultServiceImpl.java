package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.config.EmailUtil;
import com.blood.bloodservice.dao.CheckresultMapper;
import com.blood.bloodservice.dao.InformMapper;
import com.blood.bloodservice.entity.*;
import com.blood.bloodservice.service.CheckresultService;
import com.sun.java.accessibility.util.java.awt.CheckboxTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 体检结果实现类
 * @author zyqfz
 * @date 2019/9/26 - 16:48
 */
@Service
public class CheckresultServiceImpl implements CheckresultService {
    @Autowired
    CheckresultMapper checkresultMapper;
    @Autowired
    InformMapper informMapper;
    //添加体检结果
    @Override
    public int addCheckresult(Checkresult checkresult) {

         checkresultMapper.insert(checkresult);
        return checkresult.getId();
    }

    //查询所有体检结果
    @Override
    public List<Checkresult> selectCheckresult() {

        CheckresultExample checkresultExample = new CheckresultExample();
        checkresultExample.setOrderByClause("id desc");
        List<Checkresult> list = checkresultMapper.selectByExample(checkresultExample);
        if(list.isEmpty())
            return null;
        else
            return list;
    }

    //根据体检结果id查询详细信息
    @Override
    public Checkresult selectOneCheckresult(Integer id) {

        Checkresult checkresult = checkresultMapper.selectByPrimaryKey(id);
        if(checkresult==null)
            return null;
        else
            return checkresult;
    }
    //根据体检结果状态查询所有体检结果
    @Override
    public List<Checkresult> selectCheckresultBycstate(Boolean cstate) {

        CheckresultExample checkresultExample = new CheckresultExample();
        checkresultExample.setOrderByClause("id desc");
        CheckresultExample.Criteria criteria = checkresultExample.createCriteria();
        criteria.andCstateEqualTo(cstate);
        List<Checkresult> list = checkresultMapper.selectByExample(checkresultExample);
        if(list.isEmpty())
            return null;
        else
            return list;
    }

    @Override
    public void sendemail(Userlogin userlogin, People people,Checkresult checkresult) {
        String result="体检不通过";
        if(checkresult.getCstate())
            result="体检通过";
        String title=people.getUname()+"献血体检结果单";
        String msg="姓名:"+people.getUname()+"</br>"+
                "性别:"+people.getUsex()+"</br>"+
                "体重:"+checkresult.getWeight()+"公斤  （男50公斤>=/女 45公斤>=）</br>"+
                "心率:"+checkresult.getBlv()+"/min  （60-100/min）</br>"+
                "血压:"+checkresult.getBya()+"mmHg  (90-140/60-90mmHg)</br>"+
                "血型:"+checkresult.getBtype()+"</br>"+
                "血红蛋白:"+checkresult.getBdan()+"  (110-150)</br>"+
                "乙肝:"+checkresult.getByi()+"  (阴性 true/阳性 false)</br>"+
                "转氨酶:"+checkresult.getBmei()+"  (<50)</br>"+
                "体检结果:"+result+"</br>"+
                "体检时间:"+checkresult.getCtime()+"</br>";
        EmailUtil emailUtil=new EmailUtil();
        emailUtil.sendEamilCode(people.getUemail(),title,msg);
        Inform inform=new Inform();
        inform.setUid(userlogin.getUid());
        inform.setUsertype("医务人员");
        inform.setContent(title+"</br>"+msg);
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        inform.setSenddate(dateString);
        int id=informMapper.insert(inform);
        if(id>0)
            System.out.println("信息添加成功！！");
    }

}
