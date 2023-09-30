package com.mq.handler.controller;

import com.mq.repository.ChatroomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatRoomController {

    private ChatroomRepository chatroomRepository;

    @GetMapping("/room/{rooId}")
    public String roomDetail (Model model, @PathVariable String roomId) {
        model.addAttribute("roomId", roomId);
        return "/roomdetail";
    }
}
