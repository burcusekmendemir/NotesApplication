package com.burcu.NotesApp.service;

import com.burcu.NotesApp.entity.Note;
import com.burcu.NotesApp.entity.User;
import com.burcu.NotesApp.repository.NoteRepository;
import com.burcu.NotesApp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;
    private final UserRepository userRepository;

    public void save(Note note,String username) {
        Optional<User> userOptional = userRepository.findById(username);
        if(userOptional.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        note.setUser(userOptional.get());
        noteRepository.save(note);
    }

    public void deleteById(Long id,String username) {
        Optional<Note> noteOptional = noteRepository.findById(id);
        if(noteOptional.isPresent() && noteOptional.get().getUser().getUsername().equals(username)) {
            noteRepository.delete(noteOptional.get());
        } else {
            throw new RuntimeException("Note not found or unauthorized");
        }
    }


    public List<Note> findAll(String username) {
        return noteRepository.findByUser_UsernameOrderByIdDesc(username);
    }
}
