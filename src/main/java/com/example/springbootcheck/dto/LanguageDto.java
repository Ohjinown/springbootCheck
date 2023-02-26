package com.example.springbootcheck.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class LanguageDto {
    private Long language_id;
    private String name;
    private LocalDateTime last_update;
}
