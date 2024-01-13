package data.repositories;

import data.models.CallHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CallHistoryRepository extends MongoRepository<CallHistory, String> {
}
