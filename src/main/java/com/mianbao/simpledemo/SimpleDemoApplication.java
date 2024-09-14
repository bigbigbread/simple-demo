package com.mianbao.simpledemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
@Slf4j
public class SimpleDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleDemoApplication.class, args);
    }
    
    @GetMapping("/hello")
    public String f() {
        String helloWorld = "Hello World!";
        log.info(helloWorld);
        return helloWorld;
    }
    
    @GetMapping("/test")
    public String d() {
        String test = "test!";
        log.info(test);
        return test;
    }
}
