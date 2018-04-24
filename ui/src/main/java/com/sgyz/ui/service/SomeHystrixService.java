package com.sgyz.ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SomeHystrixService {

    @Autowired
    RestTemplate restTemplate; //1

    public String getSome() {
        return restTemplate.getForObject("http://some/getsome", String.class);
    }
}
