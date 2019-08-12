package com.qf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @Description:
 * @Company: 千锋互联
 * @Author: 李丽婷
 * @Date: 2019/8/5
 * @Time: 上午10:56
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        System.out.println("websocket拦截路径初始化");

        //WebSocketHandler webSocketHandler, String... paths)
        //http://localhost:8080/websocket/zhangsan

        webSocketHandlerRegistry.addHandler(new ChatWebsocketHandler(),"/websocket/*").addInterceptors(new ChatHandshakeInterceptor());//HandshakeInterceptor


    }
}
