package dto.response;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class CallSuccessfulResponse {
    @Id
    private String message;
}
