package com.sgyz.ui.controller;

import com.sgyz.ui.service.PersonHystrixService;
import com.sgyz.ui.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UiController {
    @Autowired
    private PersonHystrixService personHystrixService;

    @RequestMapping(value = "/dispatch")
    public Person sendMessage(long id){
        return personHystrixService.findOne(id);
    }



}
