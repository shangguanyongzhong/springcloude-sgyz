package com.sgyz.some;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SomeApplication {

    private static final String MESSAGE = "I LOVE YOU!";

    @RequestMapping(value = "/getsome")
    public String getsome(){
        return MESSAGE;
    }

    public static void main(String[] args) {
        SpringApplication.run(SomeApplication.class, args);
    }
}
