package com.example.helloWorld;

import org.springframework.boot.SpringApplication;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }

    // first task

//    @GetMapping("/helloWorld")
//    public CommonClass hello() {
//        CommonClass helloWorld = new CommonClass("Hello World");
//        return helloWorld;
//    }

    // Second Task(addition)

//    @GetMapping("/addition")
//    public CommonClass addition(@RequestParam double firstNum, @RequestParam double secondNum) {
//        double add = firstNum + secondNum;
//        CommonClass addition = new CommonClass(Double.toString(add));
//        return addition;
//    }

    // Second Task(division)

//    @GetMapping("/division")
//    public CommonClass division(@RequestParam double firstNum, @RequestParam double secondNum) {
//        double div = firstNum / secondNum;
//        CommonClass divide = new CommonClass(Double.toString(div));
//
//        return divide;
//    }

}
