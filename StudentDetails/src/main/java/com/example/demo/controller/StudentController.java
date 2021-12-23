package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;



@RestController
@RequestMapping("/api")
public class StudentController {
	
@Autowired 
StudentService service;


@GetMapping("/GetStudents")
public List<Student> getAllStudents()
{
	return service.getAllStudents();
}

@PostMapping ("/Students")
public void saveStudents(@RequestBody Student ss)
{
	 service.saveStudents(ss);
}

@PostMapping ("/deleteStudents/{id}")
public void deleteStudents(@PathVariable String id)
{
	 service.deleteStudents(id);
}

@GetMapping ("/getStu/{id}")
public Optional<Student> getStu(@PathVariable String id) {
	return service.getStu(id);
}

}
