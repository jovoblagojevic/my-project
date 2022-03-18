package com.jovo.myproject.research.service;

import com.jovo.myproject.research.domain.Recipe1;
import com.jovo.myproject.research.repository.Recipe1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Recipe1Service {

    @Autowired
    private Recipe1Repository recipe1Repository;


    public List<Recipe1> getAll() {
        return recipe1Repository.findAll();
    }

    public void save(Recipe1 recipe) {
        recipe1Repository.save(recipe);
    }

    public void delete(Long id) {
        recipe1Repository.deleteById(id);
    }

    public Optional<Recipe1> findOne(Long id) {
        return recipe1Repository.findById(id);
    }
}
