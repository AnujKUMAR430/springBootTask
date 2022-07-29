package com.example.helloWorld;
import com.example.helloWorld.common_class.CommonClass;
import com.example.helloWorld.student.StudentClass;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.List;

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
    @GetMapping(path = "student")
    public List<StudentClass> st(){
        return List.of(new StudentClass(1l,
                "Anuj Bhardwaj",
                "anuj@89.com",
                LocalDate.of(2000, 5, 25),
                22),
                new StudentClass(2l,
                        "Sandeep ",
                        "sandy@69.com",
                        LocalDate.of(1999, 7, 20),
                        22)

        );


    }
}
