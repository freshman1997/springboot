package com.yuan.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.yuan.cn"})
public class ShiroDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShiroDemoApplication.class, args);
    }
}
