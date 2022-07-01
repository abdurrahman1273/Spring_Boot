package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                    Student Abdurrahman=new Student(
                            "Abdurrahman",
                            "acalis999@gmail.com",
                            LocalDate.of(2000, Month.FEBRUARY,6),
                            22
                    );
                    Student ahmet = new Student(
                            "Ahmet",
                            "Ahmet99@icloud.com",
                            LocalDate.of(2001,Month.DECEMBER,8),
                            21
                    );
                    Student Ali=new Student(
                            "Ali",
                            "Ali2132@gmail.com",
                            LocalDate.of(1995,Month.MARCH,4),
                            27
                    );
                    repository.saveAll(
                            List.of(Abdurrahman,ahmet,Ali)
                    );
        };
    }
}
