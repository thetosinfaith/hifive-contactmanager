package dto.request;

import data.enums.MessageType;
import lombok.Data;

@Data
public class SendMessageRequest {
   private String receiverPhoneNumber;
    private String text;
   private MessageType messageType;
}
