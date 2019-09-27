package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.UserloginMapper;
import com.blood.bloodservice.entity.Userlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserloginService implements UserDetailsService {

    @Autowired
    private UserloginMapper userloginMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String uemail=username.substring(0, username.lastIndexOf('_'));
        String type=username.substring(username.lastIndexOf('_')+1,username.length());
        System.out.println(uemail+" "+type);
        Userlogin userlogin=userloginMapper.loadUserByUsername(uemail,type);
        if(userlogin==null){
            throw new UsernameNotFoundException("账户不存在");
        }
        userlogin.setRoles(userloginMapper.getUserRolesByUid(userlogin.getDid()));
        return userlogin;
    }

    /**
     * 添加一条登陆数据
     * @param
     * @return
     */
    public int addUserlogin(int uid,String gmail,String upassword,String type){
        Userlogin userlogin=new Userlogin();
        userlogin.setUemail(gmail);
        userlogin.setUtype(type);
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(10);
        String encodePassword=encoder.encode(upassword);
        userlogin.setUpassword(encodePassword);
        userlogin.setUid(uid);
        userlogin.setEnabled(true);
        userlogin.setLocked(false);
        userloginMapper.insert(userlogin);
        return userlogin.getDid();
    }
}
