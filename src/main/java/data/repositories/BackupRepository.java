package data.repositories;

import com.mongodb.Block;
import data.models.Backup;
import data.models.Call;
import data.models.Contact;
import data.models.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.print.attribute.standard.Media;
import java.util.List;
import java.util.Optional;

@Repository
public interface BackupRepository extends MongoRepository<Backup, String> {
    List<Call> backupCallHistory(List<Call> calls);
    List<Contact> backupContacts(List<Contact> contacts);
    List<Message> backupMessages(List<Message> messages);
    List<Media> backupMedia(List<Media> mediaItems);
    Optional<Block> backupBlockList(String blockList);

}
