package com.example.helloWorld;

import com.example.helloWorld.HelloWorldClass.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}


	@GetMapping(path = "helloWorld")
	public HelloWorld hello() {
		 HelloWorld helloWorld = new HelloWorld("Hello World");
		 return  helloWorld;
	}

}
