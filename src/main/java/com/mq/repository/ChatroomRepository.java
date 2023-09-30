package com.mq.repository;

import com.mq.dto.ChatRoom;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ChatroomRepository {

    private Map<String, ChatRoom> chatRoomMap;

    @PostConstruct
    private void init() {
        chatRoomMap = new LinkedHashMap<>();
    }


}
