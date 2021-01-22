package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 5)
            );

            Student doddy = new Student(
                    "Doddy",
                    "doman@gmail.com",
                    LocalDate.of(1982, Month.APRIL, 20)
            );

            Student baim = new Student(
                    "Baim",
                    "baim@gmail.com",
                    LocalDate.of(1990, Month.JUNE, 13)
            );

            repository.saveAll(List.of(mariam, doddy, baim));
        };
    }
}
