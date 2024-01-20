package dto.request;

import data.enums.Group;
import lombok.Data;

import java.awt.*;

@Data
public class EditContactRequest {
    private Image profilePicture;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Group group;
}
