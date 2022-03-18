package com.jovo.myproject.research.domain;

import java.io.Serializable;

public class Recipe1Dto implements Serializable {
    private Long id;
    private String name;
    private Long note1Id;
    private String note1Description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNote1Id() {
        return note1Id;
    }

    public void setNote1Id(Long note1Id) {
        this.note1Id = note1Id;
    }

    public String getNote1Description() {
        return note1Description;
    }

    public void setNote1Description(String note1Description) {
        this.note1Description = note1Description;
    }
}
