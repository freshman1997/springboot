package com.yuan.cn.springbootadminlearning;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminLearningApplication.class, args);
    }
}
