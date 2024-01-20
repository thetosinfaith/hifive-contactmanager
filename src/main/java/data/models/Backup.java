package data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document
public class Backup {
    @Id
     private List<Call> calls;
        private List<Contact> contacts;
        private List<Message> messages;
        private List<User> profiles;
 }

