package data.models;

import data.enums.Group;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;

@Data
@Document
public class Contact {
    @Id
    private Image profilePicture;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Group group;
}
