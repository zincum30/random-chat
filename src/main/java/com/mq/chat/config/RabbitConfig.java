//package com.mq.chat.config;
//
//import com.rabbitmq.client.AMQP;
//import com.rabbitmq.client.impl.AMQImpl;
//import org.springframework.amqp.core.*;
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.amqp.rabbit.annotation.EnableRabbit;
//import org.springframework.amqp.rabbit.annotation.Queue;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableRabbit
//public class RabbitConfig {
//
//    private static final String CHAT_QUEUE_NAME ="chat.queue";
//    private static final String CHAT_EXCHANGE_NAME = "chat.exchange";
//    private static final String ROUTING_KEY = "room.*";
//
//    @Bean
//    public Queue queue(){
//        return new Queue(CHAT_QUEUE_NAME, false);
//    }
//
//    @Bean
//    public TopicExchange exchange() {
//        return new TopicExchange(CHAT_EXCHANGE_NAME);
//    }
//
//    @Bean
//    public Binding binding(Queue queue, TopicExchange exchange) {
//        return BindingBuilder
//                .bind(queue)
//                .to(exchange)
//                .with(ROUTING_KEY);
//
//    }
//
//}
