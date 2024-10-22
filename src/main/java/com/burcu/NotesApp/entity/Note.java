package com.burcu.NotesApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_note")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000, nullable = false)
    private String text;

    @ManyToOne
    @JoinColumn(name = "username_id", nullable = false)
    private User user;
}
