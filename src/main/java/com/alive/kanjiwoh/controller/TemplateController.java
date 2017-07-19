package com.alive.kanjiwoh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alive.kanjiwoh.model.TemplateDto;
import com.alive.kanjiwoh.service.TemplateService;

@RestController()
@RequestMapping("/api/template")
public class TemplateController {

    @Autowired
    TemplateService templateService;
    
    @RequestMapping("/get")
    public @ResponseBody TemplateDto get(Model model) {
    	System.out.println(this.getClass() + " get()");
    	
    	TemplateDto tt = templateService.get();
    	System.out.println(tt);
        return tt;
    }
    
}
