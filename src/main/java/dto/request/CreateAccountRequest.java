package dto.request;

import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class CreateAccountRequest {
    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private String createPassword;
    private String confirmPassword;

}
