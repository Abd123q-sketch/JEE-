package com.sigma.rest.Controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello () {

        System.out.println("\"ce package sera scané par\n" +
                "@SpringBootApplication ");

        return "Hello World from my first API @RestController ";

    }


}