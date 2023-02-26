package com.example.springbootcheck.controller;

import com.example.springbootcheck.dto.LanguageDto;
import com.example.springbootcheck.entity.Language;
import com.example.springbootcheck.sevice.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @PostMapping("create/{name}")
    public ResponseEntity<Language> createLanguage(@PathVariable("name") String name, Language language) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String today = format.format(date);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(today, dateTimeFormatter);

        language.setName(name);
        language.setLast_update(dateTime);
        Language saveLanguage = languageService.createLanguage(language);
        return new ResponseEntity<>(saveLanguage, HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Language> getLanguage(@PathVariable String name) {
        Language language = languageService.getLanguage(name);
        return new ResponseEntity<>(language, HttpStatus.OK);
    }


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Language>> getAllLanguage() {
        List<Language> languageList = languageService.getLanguagesList();
        return new ResponseEntity<>(languageList, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<String> deleteLanguage(@PathVariable("name") String name) {
        languageService.deleteLanguage(name);
        return new ResponseEntity<>(name, HttpStatus.OK);
    }

}
