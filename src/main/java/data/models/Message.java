package data.models;

import data.enums.MessageType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class Message {
    @Id
    private String receiver;
    private String phoneNumber;
    private String messageContent;
    private MessageType messageType;
    private boolean isSent;
    private LocalDateTime sentDateTime;

}