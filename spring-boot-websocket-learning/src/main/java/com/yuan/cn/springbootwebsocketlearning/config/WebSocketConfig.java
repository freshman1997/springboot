package com.yuan.cn.springbootwebsocketlearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class WebSocketConfig {
    //创建服务器端点
    /**
     * 有了这个bean，就可以使用@ServerEndpoint定义一个端点服务类。在这个站点服务类中，还可以定义websocket的
     * 打开、关闭、错误和发送消息的方法
     * @return
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter()
    {
        return new ServerEndpointExporter();
    }
}
