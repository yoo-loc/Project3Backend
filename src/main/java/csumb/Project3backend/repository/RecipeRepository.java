package csumb.project3backend.repository;

import csumb.project3backend.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String> {
    
    // Define a custom query for MongoDB
    List<Recipe> findByIngredientsContaining(String ingredient);
}
