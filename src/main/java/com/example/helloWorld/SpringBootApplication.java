package com.example.helloWorld;


import com.example.helloWorld.first_task.CommonClass;
import org.springframework.boot.SpringApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@org.springframework.boot.autoconfigure.SpringBootApplication
@RestController
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }

    // first task
    @GetMapping("/helloWorld")
    public CommonClass hello() {
        CommonClass helloWorld = new CommonClass("Hello World");
        return helloWorld;
    }

    // Second Task
    @GetMapping("/addition")
    public CommonClass addition(@RequestParam double num1, @RequestParam double num2) {
        double add = num1 + num2;
        CommonClass addition = new CommonClass(Double.toString(add));
        return addition;
    }

    @GetMapping("/division")
    public CommonClass division(@RequestParam double num1, @RequestParam double num2) {
        double add = num1 / num2;
        CommonClass divide = new CommonClass(Double.toString(add));

        return divide;
    }


}
