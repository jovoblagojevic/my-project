package com.jovo.myproject.research.web;

import com.jovo.myproject.recipe.web.dto.RecipeDto;
import com.jovo.myproject.research.domain.Recipe1Dto;
import com.jovo.myproject.research.domain.Recipe1Mapper;
import com.jovo.myproject.research.service.Recipe1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/recipe1")
public class Recipe1Resource {

    @Autowired
    private Recipe1Service recipe1Service;

    @Autowired
    private Recipe1Mapper recipe1Mapper;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Recipe1Dto>> all()
    {
        List<Recipe1Dto> recipeList = recipe1Service.getAll()
                .stream()
                .map(recipe1Mapper::recipe1ToRecipe1Dto)
                .collect(Collectors.toList());

        return new ResponseEntity<>(recipeList, HttpStatus.OK);
    }
}
