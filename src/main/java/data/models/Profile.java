package data.models;

import lombok.Data;

import java.util.Date;
@Data
public class Profile {
        private String userID;
        private String username;
        private String firstName;
        private String lastName;
        private Date dateOfBirth;
        private String phoneNumber;
        private String profilePictureURL;

    }
