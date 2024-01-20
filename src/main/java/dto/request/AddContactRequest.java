package dto.request;

import data.enums.Group;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;

@Data
public class AddContactRequest {
    private Image profilePicture;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Group group;
}
