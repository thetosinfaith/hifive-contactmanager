package data.models;

import data.enums.CallType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class Call {
    @Id
    private Contact contacts;
    private LocalDateTime callDateTime;
    private String callDurationInSeconds;
    private CallType callType;
}
