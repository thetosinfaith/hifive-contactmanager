package data.repositories;

import data.models.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
   Optional<Message>findByReceiverPhoneNumber(String receiverPhoneNumber);
   Optional<Message>findByName(String receiverPhoneNumber);
   Optional<Message>findByReceiverEmail(String receiverPhoneNumber);

}
