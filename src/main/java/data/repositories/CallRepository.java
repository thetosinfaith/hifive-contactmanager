package data.repositories;

import data.models.Call;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CallRepository extends MongoRepository<Call, String> {
    List<Call> findByCallerPhoneNumber(String callerPhoneNumber);
}
