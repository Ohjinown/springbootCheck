package com.example.springbootcheck.repository;

import com.example.springbootcheck.entity.Language;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")

class LanguageRepositoryTest {

    @Autowired
    LanguageRepository languageRepository;
    
//    @Test
//    @DisplayName("언어 insrt 테스트")
//    public void insertLanguageTest() {
//        Language language = new Language();
//
//        language.setLast_update(LocalDateTime.now());
//        language.setName("데스트 이름");
//        Language languageSave = languageRepository.save(language);
//        System.out.println(languageSave.toString());
//
//    }

//    @Test
//    @DisplayName("이름찾기")
//    public void findByLanguageTest() {
//        List<Language> languageList = languageRepository.findByName("진원");
//            for (Language language : languageList) {
//                System.out.println(language);
//            }
//
//    }
}