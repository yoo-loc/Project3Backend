package csumb.project3backend.controller;

import csumb.project3backend.model.Recipe;
import csumb.project3backend.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @PostMapping("/post")
    public Recipe postRecipe(@RequestBody Recipe recipe) {
        return recipeService.saveRecipe(recipe);
    }

    @GetMapping("/search")
    public List<Recipe> searchRecipes(@RequestParam String ingredient) {
        return recipeService.searchByIngredient(ingredient);
    }

    @GetMapping("/all")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }
}
