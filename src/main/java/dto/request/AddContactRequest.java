package dto.request;

import data.enums.Group;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class AddContactRequest {
    private String imageUrl;
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private Group group;

}
