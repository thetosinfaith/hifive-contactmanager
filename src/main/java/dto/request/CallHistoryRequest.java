package dto.request;

import lombok.Data;

@Data
public class CallHistoryRequest {
    private String callerPhoneNumber;
    private long startTime;
    private long endTime;
    private String callType;
}
