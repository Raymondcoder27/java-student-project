package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class StudentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}

//	@GetMapping
//	public String hello(){
//		return "Hello World";
//	}

//	@GetMapping
//	public List<String> hello(){
//		return List.of("Hello", "World");
//	}

//	@GetMapping
//	public List<Student> hello(){
//		return List.of(
//				new Student(
//						1L,
//						"Mariam",
//						21,
//						LocalDate.of(2000, Month.AUGUST,27),
//						"mariam@gmail.com"
//				)
//		);
//	}
}
