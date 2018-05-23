package com.zxmoa.myhzt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(basePackages = "com.zxmoa.myhzt.mapper")
//扫描监听
@ServletComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class MyhztApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyhztApplication.class, args);
    }
}
