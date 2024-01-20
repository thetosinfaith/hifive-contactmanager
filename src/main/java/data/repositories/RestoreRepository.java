package data.repositories;

import com.mongodb.Block;
import data.models.Call;
import data.models.Contact;
import data.models.Message;
import data.models.Restore;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.print.attribute.standard.Media;
import java.util.List;
import java.util.Optional;

@Repository
public interface RestoreRepository extends MongoRepository<Restore, String> {
    List<Call> restoreCallHistory(List<Call> calls);
    List<Contact> restoreContacts(List<Contact> contacts);
    List<Message> restoreMessages(List<Message> messages);
    List<Media> restoreMedia(List<Media> mediaItems);
    Optional<Block> restoreBlockList(String blockList);
}
