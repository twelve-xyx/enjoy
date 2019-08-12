package com.qf.config;

import com.alibaba.fastjson.JSON;
import com.qf.util.Constants;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description:
 * @Company: 千锋互联
 * @Author: 李丽婷
 * @Date: 2019/8/5
 * @Time: 上午11:02
 */
//public class ChatWebsocketHandler  implements WebSocketHandler {
public class ChatWebsocketHandler  extends TextWebSocketHandler {
    private static  Map<String,WebSocketSession> sessionMap = null;
    private String   name;

    static{
        sessionMap = new ConcurrentHashMap<String, WebSocketSession>();
    }

    public void setName(String name) {
        this.name = name;
    }

    //@onOpen
    @Override
    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {
        //得到登录的用户?? attributes.put(Constants.WEBSOCKET_USERNAME,name);
       String name = (String) webSocketSession.getAttributes().get(Constants.WEBSOCKET_USERNAME);
        System.out.println("建立连接"+name);
        setName(name);
        //用户和会话的关系
       sessionMap.put(name,webSocketSession);

    }

    //@OnMessage
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
       String   json = new  String( message.asBytes());
       Map<String,String> map = JSON.parseObject(json,Map.class);
       String  toName = map.get("toName");
       String  content = map.get("content");

       //得到接收者会话
       WebSocketSession toSession =  sessionMap.get(toName);
       if (toSession!=null&&toSession.isOpen()){
           String  msg = "来自"+name+"的消息，内容："+content;
           TextMessage textMessage = new TextMessage(msg);
           toSession.sendMessage(textMessage);

       }else{
           String  msg = toName+"没上线";
           TextMessage textMessage = new TextMessage(msg);
           session.sendMessage(textMessage);
       }


    }


    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {
        if (webSocketSession!=null){
            webSocketSession.close();
        }
        //移除会话
        sessionMap.remove(name);

    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {
        //移除会话
        sessionMap.remove(name);
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
