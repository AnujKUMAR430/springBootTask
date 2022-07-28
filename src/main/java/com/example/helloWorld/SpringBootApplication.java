package com.example.helloWorld;

import com.example.helloWorld.first_task.HelloWorld;
import com.example.helloWorld.second_task.Addition;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@org.springframework.boot.autoconfigure.SpringBootApplication
@RestController
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }

    // first task
    @GetMapping("/helloWorld")
    public HelloWorld hello() {
        HelloWorld helloWorld = new HelloWorld("Hello World");
        return helloWorld;
    }

    @GetMapping(path = "addition")
    public Addition addition() {
        Addition add = new Addition(1);
        return add;
    }




}
