package com.hzy.gpmybatisdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hzy.gpmybatisdemo1.mapper")
public class GpMybatisDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(GpMybatisDemo1Application.class, args);
    }

}
