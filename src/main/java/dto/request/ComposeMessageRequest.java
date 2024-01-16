package dto.request;

import data.enums.MessageType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class ComposeMessageRequest {
   private String receiverPhoneNumber;
    private String messageContent;
   private MessageType messageType;
}
