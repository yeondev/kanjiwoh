package com.alive.kanjiwoh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alive.kanjiwoh.model.WordDto;
import com.alive.kanjiwoh.model.WordGroupDto;
import com.alive.kanjiwoh.service.WordService;

@RestController
@RequestMapping(path = "/api/word")
public class WordController {

    @Autowired
    WordService wordService;
    
    @RequestMapping(path = "/test")
    public WordDto show(Model model) {
    	System.out.println("hello world");
        return wordService.test();
    }
    
    @RequestMapping(path = "/add", method=RequestMethod.POST)
    public WordGroupDto add(@RequestBody WordGroupDto wordGroupDto) {
    	System.out.println("/api/word/add started : " + wordGroupDto.toString());
    	return wordService.add(wordGroupDto);
    }
    
}
