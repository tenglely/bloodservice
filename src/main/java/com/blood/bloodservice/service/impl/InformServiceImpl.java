package com.blood.bloodservice.service.impl;
import com.blood.bloodservice.dao.InformMapper;
import com.blood.bloodservice.entity.Inform;
import com.blood.bloodservice.service.InformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 信息通知添加
 * @author zyqfz
 * @date 2019/9/27 - 8:43
 */
@Service
public class InformServiceImpl implements InformService {
    @Autowired
    InformMapper informMapper;
    @Override
    public int addInform(Inform inform) {

        informMapper.insert(inform);
        return inform.getId();
    }
}
