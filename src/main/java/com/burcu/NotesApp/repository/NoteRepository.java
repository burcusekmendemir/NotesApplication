package com.burcu.NotesApp.repository;

import com.burcu.NotesApp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByUser_UsernameOrderByIdDesc(String username);
}
