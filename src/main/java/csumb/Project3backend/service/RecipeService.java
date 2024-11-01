package csumb.Project3backend.service;

import csumb.project3backend.model.Recipe;
import csumb.project3backend.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public List<Recipe> searchByIngredient(String ingredient) {
        return recipeRepository.findByIngredientsContaining(ingredient);
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
}
