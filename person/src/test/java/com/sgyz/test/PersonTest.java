package com.sgyz.test;

import com.sgyz.entity.PersonEntity;
import com.sgyz.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testFindOne(){
        PersonEntity entity = personRepository.findOne(1L);
        System.out.println(entity);
    }

}
