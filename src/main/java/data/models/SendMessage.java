package data.models;

import enums.MessageType;

import java.time.LocalDateTime;

public class SendMessage {
    private String sender;
    private String receiver;
    private String messageContent;
    private MessageType messageType;
    private boolean isSent;
    private LocalDateTime sentDateTime;
 }
