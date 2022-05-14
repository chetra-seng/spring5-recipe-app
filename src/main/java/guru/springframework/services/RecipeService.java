package guru.springframework.services;

import guru.springframework.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
