package dto.request;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CreateAccountRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String createPassword;
    private String confirmPassword;

    }

