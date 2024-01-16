package data.repositories;

import data.models.CallHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Repository
public interface CallHistoryRepository extends MongoRepository<CallHistory, String> {
}
