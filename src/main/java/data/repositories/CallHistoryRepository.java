package data.repositories;

import data.models.CallHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface CallHistoryRepository extends MongoRepository<CallHistory, String> {
    private final CallHistoryRepository callHistoryRepository;
}
