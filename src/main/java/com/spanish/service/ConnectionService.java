package com.spanish.service;

import com.spanish.domain.Word;
import com.spanish.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionService {
    private final WordRepository wordRepository;

    @Autowired
    public ConnectionService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public Word getWordById(Long id) {
        return wordRepository.getById(id);
    }

    public Word randomWord() {
        long wordAmount = wordRepository.count();
        long index = (long) (Math.random() * wordAmount);

        return wordRepository.getById(index);
    }

    public List<Word> getAll() {
        return wordRepository.findAll();
    }

}
