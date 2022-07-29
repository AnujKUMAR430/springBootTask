package com.example.helloWorld;

import com.example.helloWorld.first_task.HelloWorldClass;
import com.example.helloWorld.second_task.ArithmeticOperationsClass;
import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import net.minidev.json.JSONObject;



@org.springframework.boot.autoconfigure.SpringBootApplication
@RestController
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }

    // first task
    @GetMapping("/helloWorld")
    public HelloWorldClass hello() {
        HelloWorldClass helloWorld = new HelloWorldClass("Hello World");
        return helloWorld;
    }

    // Second Task
    @GetMapping("/addition")
    public ArithmeticOperationsClass addition() {
        ArithmeticOperationsClass add = new ArithmeticOperationsClass(addNumber());
        return add;
    }

    int addNumber() {
        int num1 = 5;
        int num2 = 5;
        int add = num1 + num2;
        System.out.println(add);
        return add;
    }

    @GetMapping("/division")
    public ArithmeticOperationsClass divide() {
        ArithmeticOperationsClass div = new ArithmeticOperationsClass(divideNumber());
        return div;
    }

    int divideNumber() {
        int num1 = 10;
        int num2 = 5;
        int div = num1 / num2;
        System.out.println(div);
        return div;
    }



    @RestController
    public class AdditionController {

        private final Addition addition;

        public AdditionController(Addition addition) {
            this.addition = addition;
        }


        
        @GetMapping("/add")
        public ResponseEntity<Object> getAddition(@RequestParam Integer a, @RequestParam Integer b) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data", addition.sum(a, b));
            return ResponseEntity.ok(jsonObject);
        }

        @Service
        public class Addition {

            public int sum(int num1, int num2) {
                return num1 + num2;
            }
        }


    }
}