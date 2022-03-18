package com.jovo.myproject.research.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Note1 {

    @Id
    private Long id;

    @Lob
    @Column(name = "description")
    private String description;

    @OneToOne
    @MapsId
    @JoinColumn(name = "recipe1_id")
    private Recipe1 recipe1;


    public Recipe1 getRecipe1() {
        return recipe1;
    }

    public void setRecipe1(Recipe1 recipe1) {
        this.recipe1 = recipe1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
