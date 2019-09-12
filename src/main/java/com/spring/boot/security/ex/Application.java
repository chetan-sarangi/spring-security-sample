package com.spring.boot.security.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sarangic on 12/09/19.
 */

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/greeting")
    public String greeting(){
        return "Hello Vegas!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
