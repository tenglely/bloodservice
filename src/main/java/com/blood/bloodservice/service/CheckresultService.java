package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Checkresult;

import java.util.List;

/**
 * 体检结果表
 * @author zyqfz
 * @date 2019/9/26 - 16:44
 */
public interface CheckresultService {
    //添加体检果
    int addCheckresult(Checkresult checkresult);

    //查询所有体检结果
    List<Checkresult> selectCheckresult();

    //根据体检结果id查询详细信息
    Checkresult selectOneCheckresult(Integer id);

    //根据体检结果状态查询体检结果列表
    List<Checkresult> selectCheckresultBycstate(Boolean cstate);

}
