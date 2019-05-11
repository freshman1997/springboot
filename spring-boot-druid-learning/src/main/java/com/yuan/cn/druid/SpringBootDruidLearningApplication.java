package com.yuan.cn.druid;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.yuan.cn.druid.domain.User;
import com.yuan.cn.druid.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.druid.pool.*;

@SpringBootApplication
@RestController
public class SpringBootDruidLearningApplication {
    @Autowired
    private UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDruidLearningApplication.class, args);
    }
    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable("id") int id)
    {
        return this.userRepository.getOne(id);
    }
}
