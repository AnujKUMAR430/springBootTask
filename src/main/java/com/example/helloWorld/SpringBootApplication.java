package com.example.helloWorld;

import com.example.helloWorld.first_task.HelloWorld;
import com.example.helloWorld.second_task.ArithmeticOperations;
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

    // Second Task
    @GetMapping("/addition")
    public ArithmeticOperations addition() {
        ArithmeticOperations add = new ArithmeticOperations(addNumber());
        return add;
    }
    int addNumber(){
        int num1 = 5;
        int num2 = 5;
        int add = num1 + num2;
        System.out.println(add);
        return add;
    }

    @GetMapping(path = "division")
    public ArithmeticOperations divide() {
        ArithmeticOperations div = new ArithmeticOperations(divideNumber());
        return div;
    }
    int divideNumber(){
        int num1 = 10;
        int num2 = 5;
        int div = num1 / num2;
        System.out.println(div);
        return div;
    }



}
