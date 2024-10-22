



package com.burcu.NotesApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

@Entity
@Table(name = "tbl_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {

    @Id
    @Column(length = 50, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Note> noteList;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;

    @Override
    public List<Role> getAuthorities()
    {
        return roles;
    }

    @Override
    public String getPassword()
    {
        return password;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    @Override
    public String getUsername()
    {
        return username;
    }
}
