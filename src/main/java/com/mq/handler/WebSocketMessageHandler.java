package com.mq.handler;

import com.mq.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class WebSocketMessageHandler {

    private final SimpMessageSendingOperations simpMessageSendingOperations;

    @MessageMapping("/chat")
    public void message (Message message) {
        message.setMessage(message.getSender() + "님이 입장하셨습니다.");
        simpMessageSendingOperations.convertAndSend("/chat/" + message.getRoomId(), message);

    }
}
