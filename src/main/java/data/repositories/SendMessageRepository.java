package data.repositories;

import data.models.Contact;
import data.models.SendMessage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface SendMessageRepository extends MongoRepository<SendMessage, String> {
    Optional<Contact> findByPhoneNumber(String email);

}
