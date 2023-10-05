//package com.mq.chat.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.util.AntPathMatcher;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
//
//@Configuration
//@EnableWebSocketMessageBroker
//public class StompConfig implements WebSocketMessageBrokerConfigurer {
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
//        stompEndpointRegistry
//                .addEndpoint("/stomp/chat")
//                .setAllowedOrigins("*")
//                .withSockJS();
//
//    }
//
//
//    @Override
//    public void configureMessageBroker (MessageBrokerRegistry messageBrokerRegistry) {
//
//        messageBrokerRegistry.setPathMatcher(new AntPathMatcher("."));
//        messageBrokerRegistry.setApplicationDestinationPrefixes("/pub");
//        messageBrokerRegistry.enableStompBrokerRelay("/queue", "/topic", "/exchange", "amq/queue");
//    }
//
//}
