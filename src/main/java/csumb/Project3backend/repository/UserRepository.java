package csumb.project3backend.repository;

import csumb.project3backend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Define any additional query methods here if needed
}