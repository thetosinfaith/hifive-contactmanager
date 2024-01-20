package dto.request;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class LoginRequest {
    private String email;
    private String Password;
}
