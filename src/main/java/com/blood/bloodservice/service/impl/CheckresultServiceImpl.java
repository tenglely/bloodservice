package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.CheckresultMapper;
import com.blood.bloodservice.entity.Checkresult;
import com.blood.bloodservice.service.CheckresultService;
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
        List<Checkresult> list = checkresultMapper.selectByExample(null);
        if(list.isEmpty())
            return null;
        else
            return list;
    }
}
