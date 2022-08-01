package com.example.helloWorld.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
@Component
public class StudentService {
    public List<StudentClass> getStudent(){
        return List.of(new StudentClass(1l,
                "Anuj",
                "anuj@89.com",
                LocalDate.of(2000, 5, 25),
                22)



        );




    }

}

