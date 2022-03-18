package com.jovo.myproject.recipe.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe;

    @BeforeEach
    void setUp() {
        recipe = new Recipe();
    }

    @Test
    void getId()
    {
        Long idValue = 7L;
        recipe.setId(idValue);
        //assertEquals(idValue, recipe.getId());
    }
}