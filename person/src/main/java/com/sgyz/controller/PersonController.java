package com.sgyz.controller;

import com.sgyz.entity.PersonEntity;
import com.sgyz.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/findOne")
    public PersonEntity findOnePerson(Long id) {
        PersonEntity entity = personRepository.findOne(id);
        return entity;
    }



}
