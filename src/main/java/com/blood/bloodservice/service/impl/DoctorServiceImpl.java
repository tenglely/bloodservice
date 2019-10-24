package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.DoctorMapper;
import com.blood.bloodservice.dao.UserloginMapper;
import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.DoctorExample;
import com.blood.bloodservice.entity.UserRole;
import com.blood.bloodservice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.security.auth.login.CredentialException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyqfz
 * @date 2019/9/27 - 15:12
 */
@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorMapper doctorMapper;

    @Autowired
    private RedisTemplate redisTemplate;


    @Autowired
    private UserloginMapper userloginMapper;
    @Override
    public int addDoctor(Doctor doctor) {

        doctorMapper.insert(doctor);
        return doctor.getDid();

    }



    //添加献血人员角色表
    public void addRoot(int did){

        for(int i=2;i<=3;i++) {
            UserRole userRole = new UserRole();
            userRole.setUid(did);
            userRole.setRid(i);
            userloginMapper.insertUserRole(userRole);

        }
    }

    //根据did查找一个doctor信息
    @Override
    public Doctor selectbydid(int did) {
        Doctor d = doctorMapper.selectByPrimaryKey(did);
        if(d!=null){
            return d;
        }
        else
            return null;
    }

    @Override
    public List<Doctor> selectDoctor() {
        DoctorExample example = new DoctorExample();
        DoctorExample.Criteria criteria = example.createCriteria();
        criteria.andPstateEqualTo(false);
        List<Doctor> doctorlist = doctorMapper.selectByExample(example);
        if(doctorlist.isEmpty())
            return null;
        else
            return doctorlist;
    }

    @Override
    public List<Doctor> findbyhospital(String dwork) {
//        List<Doctor> list= (List<Doctor>) redisTemplate.opsForHash().get("hospital",dwork);
//        if(list==null) {
            DoctorExample example = new DoctorExample();
            DoctorExample.Criteria criteria = example.createCriteria();
            criteria.andDworkEqualTo(dwork);
            List<Doctor> doctorlist = doctorMapper.selectByExample(example);
            return doctorlist;
//            System.out.println(doctorlist);
//            if(doctorlist.isEmpty()){
//                return null;
//            }else{
//                Map<String, Object> parm = new HashMap<>();
//                parm.put(dwork, doctorlist);
//                redisTemplate.opsForHash().putAll("hospital", parm);
//                list= doctorlist;
//                System.out.println("redis添加成功");
//            }
//        }
//        System.out.println("从redis成功取出同一医院的人员");
//        return list;
    }

    @Override
    public List<Doctor> findalldoctor() {
        DoctorExample doctorExample=new DoctorExample();
        doctorExample.setOrderByClause("did desc");
        List<Doctor> list=doctorMapper.selectByExample(doctorExample);
        if(list.isEmpty())
            return null;
        return list;
    }

}
