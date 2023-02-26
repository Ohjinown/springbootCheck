package com.example.springbootcheck.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "language")
@Getter
@Setter
@ToString

public class Language {

    @Id
    @Column(name = "language_id")
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동증가
    private Long language_id;

    @Column(name = "name", nullable = false)
    private String name;

    private LocalDateTime last_update;
}
