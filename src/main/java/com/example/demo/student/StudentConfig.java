package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.AUGUST;
import static java.util.Calendar.JUNE;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam =  new Student(
                    1L,
                    "Mariam",
                    21,
                    LocalDate.of(2000, JUNE, 21),
                    "mariam@gmail.com"
            );

            Student alex =  new Student(
                    2L,
                    "Alex",
                    21,
                    LocalDate.of(2002, AUGUST, 29),
                    "alex@gmail.com"
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
