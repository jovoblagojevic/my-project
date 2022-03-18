package com.jovo.myproject.recipe.web.rest;

import com.jovo.myproject.recipe.domain.Note;
import com.jovo.myproject.recipe.domain.Recipe;
import com.jovo.myproject.recipe.service.RecipeService;
import com.jovo.myproject.recipe.web.dto.RecipeDto;
import com.jovo.myproject.recipe.web.mapper.RecipeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/recipe")
public class RecipeResources {

    @Autowired
    private RecipeService recipeService;

    @Autowired
    private RecipeMapper recipeMapper;

    @GetMapping(value = "/all")
    public ResponseEntity<List<RecipeDto>> all()
    {
        List<RecipeDto> recipeList = recipeService.getAll()
                .stream()
                .map(recipeMapper::recipeToRecipeDto)
                .collect(Collectors.toList());

        return new ResponseEntity<>(recipeList, HttpStatus.OK);
    }

    @PostMapping(value = "/new")
    public ResponseEntity<Void> createRecipe()
    {
        Recipe recipe = new Recipe();
        recipe.setName("test1");
        Note note = new Note();
        note.setDescription("test");
        recipe.setNote(note);
        recipeService.save(recipe);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> deleteRecipe(@RequestParam Long id)
    {
        if (!recipeService.findOne(id).isPresent()){
            throw new IllegalArgumentException("Unknown id");
        }
        recipeService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
