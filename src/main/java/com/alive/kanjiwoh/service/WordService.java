package com.alive.kanjiwoh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alive.kanjiwoh.mapper.WordMapper;
import com.alive.kanjiwoh.model.WordDto;

@Service
public class WordService {

    @Autowired
    WordMapper wordMapper;
    
    public WordDto test() {
        return wordMapper.findAll();
    }
}
