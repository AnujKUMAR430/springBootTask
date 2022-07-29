package com.example.helloWorld;

import com.example.helloWorld.common_class.CommonClass;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

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

    // Second Task(addition)

    @GetMapping("/addition")
    public CommonClass addition(@RequestParam double firstNum, @RequestParam double secondNum) {
        double add = firstNum + secondNum;
        CommonClass addition = new CommonClass(Double.toString(add));
        return addition;
    }

    // Second Task(division)

    @GetMapping("/division")
    public CommonClass division(@RequestParam double firstNum, @RequestParam double secondNum) {
        double div = firstNum / secondNum;
        CommonClass divide = new CommonClass(Double.toString(div));

        return divide;
    }
    @GetMapping(path = "multiply")
    public CommonClass multiply(@RequestParam double num1, @RequestParam double num2){
        double mul = num1 * num2;
        CommonClass multiplication = new CommonClass(Double.toString(mul));
        return multiplication;
    }
    @GetMapping(path = "subtract")
    public CommonClass sub(@RequestParam double firstNum, @RequestParam double secondNum){
        double subtraction = firstNum - secondNum;
        CommonClass subtract = new CommonClass(Double.toString(subtraction));
        return subtract;
    }

}
