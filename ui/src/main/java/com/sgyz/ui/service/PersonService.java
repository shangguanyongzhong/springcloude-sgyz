package com.sgyz.ui.service;

import com.sgyz.ui.vo.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient("person")
public interface PersonService {

    @RequestMapping("/findOne")
    @ResponseBody Person findOnePerson(@RequestParam(value="id") Long id);
}
