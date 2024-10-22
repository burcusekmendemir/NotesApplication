package com.burcu.NotesApp.service;

import com.burcu.NotesApp.entity.User;
import com.burcu.NotesApp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean login(String username, String rawPassword) {
        Optional<User> userOptional = userRepository.findById(username);

        if (userOptional.isPresent()) {
            User user = userOptional.get();

            // Şifre karşılaştırması: Hashlenmiş şifre ile karşılaştır
            return passwordEncoder.matches(rawPassword, user.getPassword());
        }

        return false;
    }
}