package com.dc.spring.boot.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerBasicApplication.class, args);
    }

    @RequestMapping(value="/")
    public String demo(){
        return "Spring Boot - Docker";
    }
}
