package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;



@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	
	
	public List<Student> getAllStudents()
	{
		return repository.findAll();
	}
	
	public void saveStudents(Student s) {
		repository.save(s);
	}

	public void deleteStudents(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	public Optional<Student> getStu(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
}
