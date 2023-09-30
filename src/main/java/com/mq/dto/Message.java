package com.mq.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String type;
    private String sender;
    private String roomId;
    private Object Data;

    public void setMessage(String sender) {
    }
}
