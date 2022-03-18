package com.jovo.myproject.recipe.repository;

import com.jovo.myproject.recipe.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}