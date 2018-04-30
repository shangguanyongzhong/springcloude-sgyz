package com.sgyz.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sgyz.ui.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonHystrixService {

    @Autowired
    PersonService personService;

    @HystrixCommand (fallbackMethod = "fallbackSave")
        public Person findOne(Long id){

        Person p =  personService.findOnePerson(id);

       return p;
    }

    public Person fallbackSave(Long id){

        Person p = new Person();
        p.setName("id="+id + "查询没有成功，Person Service 故障");
       return p;
    }
}
