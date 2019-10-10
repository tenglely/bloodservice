package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.CheckresultMapper;
import com.blood.bloodservice.entity.Checkresult;
import com.blood.bloodservice.entity.CheckresultExample;
import com.blood.bloodservice.service.CheckresultService;
import com.sun.java.accessibility.util.java.awt.CheckboxTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
