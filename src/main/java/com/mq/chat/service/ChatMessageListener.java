package com.mq.chat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

    private static final Logger log = LoggerFactory.getLogger(ChatMessageListener.class);

    @RabbitListener(queues = "hello")
    public void receiveMessage(Message message) {
        log.info("consumer consumes message: {}", message);
    }
}
