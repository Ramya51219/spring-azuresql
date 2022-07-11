package com.example.demosql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentrepository;
	
	@GetMapping("/all")
	public List<Student> getAllStudents(){
		return studentrepository.findAll();
	}
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentrepository.save(student);
	}
	
	

}
