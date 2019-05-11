package com.yuan.cn.springbootwebsocketlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringBootWebsocketLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebsocketLearningApplication.class, args);
    }
    @GetMapping("/index")
    public String websocket()
    {
        return "websocket";
    }
}
