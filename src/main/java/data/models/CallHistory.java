package data.models;

import data.enums.CallType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class CallHistory {
    @Id
    private String contactId;
    private String phoneNumbers;
    private CallType callType;
    private int callDuration;
    private LocalDateTime callDateTime;




}
