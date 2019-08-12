package com.qf.config;

import com.qf.util.Constants;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;

/**
 * @Description:
 * @Company: 千锋互联
 * @Author: 李丽婷
 * @Date: 2019/8/5
 * @Time: 上午11:07
 */
public class ChatHandshakeInterceptor extends HttpSessionHandshakeInterceptor {
    /**
     *  在握手之前执行该方法, 继续握手返回true, 中断握手返回false.
     *  通过attributes参数设置WebSocketSession的属性
     * @throws Exception
     */
    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
        System.out.println("握手前");
        //得到请求参数
        //http://localhost:8080/websocket/zhangsan
        String  uri =  request.getURI().toString();
        String  name = uri.substring(uri.lastIndexOf("/")+1);
        attributes.put(Constants.WEBSOCKET_USERNAME,name);

        return super.beforeHandshake(request,response,wsHandler,attributes);

    }




    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {
        System.out.println("握手后");
        super.afterHandshake(serverHttpRequest,serverHttpResponse,webSocketHandler,e);

    }
}
