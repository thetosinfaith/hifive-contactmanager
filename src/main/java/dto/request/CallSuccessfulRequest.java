package dto.request;

import data.enums.CallType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class CallSuccessfulRequest {
    private CallType callType;
    private String startTime;
    private String endTime;
}
