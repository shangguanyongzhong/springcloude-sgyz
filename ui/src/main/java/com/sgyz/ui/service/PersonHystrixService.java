package com.sgyz.ui.service;

import com.sgyz.ui.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonHystrixService {

    @Autowired
    PersonService personService;

    public Person findOne(Long id){

        Person p =  personService.findOnePerson(id);

        return p;
    }
}
