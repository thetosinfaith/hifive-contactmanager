package data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;
@Document
@Data
public class User {
        @Id
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String emailAddress;
        private String createPassword;
        private String confirmPassword;

}
