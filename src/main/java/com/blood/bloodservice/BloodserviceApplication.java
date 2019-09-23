package com.blood.bloodservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.blood.bloodservice.dao")
@SpringBootApplication
public class BloodserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloodserviceApplication.class, args);
    }

}
