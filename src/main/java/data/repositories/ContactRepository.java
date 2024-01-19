package data.repositories;
import data.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
    public interface ContactRepository extends MongoRepository<Contact, String> {
        Optional<Contact> findByPhoneNumber(String phoneNumber);
    }
