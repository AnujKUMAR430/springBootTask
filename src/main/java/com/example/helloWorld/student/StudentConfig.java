package com.example.helloWorld.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student anuj = new Student(
                    "Anuj",
                    "anuj@89.com",
                    LocalDate.of(2000, 5, 2));

            Student ashik = new Student(
                    "ashik",
                    "ashik@89.com",
                    LocalDate.of(2001, 1, 6));
            repository.saveAll(List.of(anuj, ashik));


        };
    }

}
