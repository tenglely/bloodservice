package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.CheckagainMapper;
import com.blood.bloodservice.entity.Checkagain;
import com.blood.bloodservice.entity.CheckagainExample;
import com.blood.bloodservice.entity.Checkresult;
import com.blood.bloodservice.service.CheckAgainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**\
 * 二次检测结果
 * @author zyqfz
 * @date 2019/9/26 - 23:51
 */
@Service
public class CheckAgainServiceImpl implements CheckAgainService {
    @Autowired
    CheckagainMapper checkagainMapper;


    @Override
    public int addCheckAgain(Checkagain checkagain) {
        checkagainMapper.insert(checkagain);
        return checkagain.getCid();
    }

    //查询所有二次检测结果
    @Override
    public List<Checkagain> selectCheckagain() {
        CheckagainExample checkagainExample = new CheckagainExample();
        //根据id降序排序结果
        checkagainExample.setOrderByClause("cid desc");
        List<Checkagain> list = checkagainMapper.selectByExample(checkagainExample);
        if(list.isEmpty()){
            return null;
        }
        else
         return list;
    }

    //根据复检结果cid查询复检结果详细信息
    @Override
    public Checkagain selectOnecheckagain(Integer cid) {
        Checkagain checkagain = checkagainMapper.selectByPrimaryKey(cid);
        if(checkagain==null)
            return null;
        else
            return checkagain;
    }

    //根据复检结果状态查询所有复检结果
    @Override
    public List<Checkagain> selectCheckagainBycstate(Boolean cstate) {
        CheckagainExample checkagainExample = new CheckagainExample();
        //根据id降序排序结果
        checkagainExample.setOrderByClause("cid desc");
        CheckagainExample.Criteria criteria = checkagainExample.createCriteria();
        criteria.andCstateEqualTo(cstate);
        List<Checkagain> list = checkagainMapper.selectByExample(checkagainExample);
        if(list.isEmpty()){
            return null;
        }
        else
            return list;
    }
}
