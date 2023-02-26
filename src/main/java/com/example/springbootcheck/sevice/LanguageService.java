package com.example.springbootcheck.sevice;

import com.example.springbootcheck.entity.Language;
import com.example.springbootcheck.repository.LanguageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class LanguageService {
    private final LanguageRepository languageRepository;

    public Language createLanguage(Language language) {
        Language saveLanguage = languageRepository.save(language);
        return saveLanguage;
    }
    public Language getLanguage(String name) {
        return languageRepository.findByName(name);
    }
    public List<Language> getLanguagesList() {
        return languageRepository.findAll();
    }

    public void deleteLanguage(String name) {
        languageRepository.deleteByName(name);
    }
}
