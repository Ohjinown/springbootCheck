package com.example.springbootcheck.repository;

import com.example.springbootcheck.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {

    Language findByName(String name);// findBy 찾고있는 Language 변수명
    void deleteByName(String name);

}
