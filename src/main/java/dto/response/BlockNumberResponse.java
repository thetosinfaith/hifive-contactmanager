package dto.response;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class BlockNumberResponse {
    private String message;
}
