package com.codealpine.serverdemo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codealpine.serverdemo.student.Student;

@SpringBootApplication
@RestController
public class ServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDemoApplication.class, args);
	}

	@GetMapping
	public List<Student> homepage() {
		return List.of(new Student(1L, "IamAstudent", "example@example.com", LocalDate.of(2000, Month.APRIL, 5), 22));
	}

}
