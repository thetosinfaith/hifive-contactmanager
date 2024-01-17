package dto.request;

import lombok.Data;

@Data
public class CreateAccountRequest {
    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private String createPassword;
    private String confirmPassword;

}
