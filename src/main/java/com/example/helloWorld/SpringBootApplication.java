package com.example.helloWorld;

import com.example.helloWorld.HelloWorld.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@org.springframework.boot.autoconfigure.SpringBootApplication
@RestController
public class SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}


	@GetMapping("/helloWorld")
	public HelloWorld hello() {
		 HelloWorld helloWorld = new HelloWorld("Hello World");
		 return  helloWorld;
	}



}
