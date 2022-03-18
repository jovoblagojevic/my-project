package com.jovo.myproject.recipe.service;

import com.jovo.myproject.recipe.domain.Recipe;
import com.jovo.myproject.recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;


    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public void save(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public void delete(Long id) {
        recipeRepository.deleteById(id);
    }

    public Optional<Recipe> findOne(Long id) {
        return recipeRepository.findById(id);
    }
}
