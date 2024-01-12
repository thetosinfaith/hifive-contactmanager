package data.models;

import enums.Group;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Contact {
    @Id
    private String imageUrl;
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private Group group;
}
