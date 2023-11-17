package com.home.Chat_SpringBoot.chat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType messageType;
}
