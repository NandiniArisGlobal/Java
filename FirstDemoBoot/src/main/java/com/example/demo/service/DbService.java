package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Db;
import com.example.demo.repository.DbRepository;
import com.example.demo.controller.DbController;



@Service
public class DbService {

	@Autowired
	DbRepository repository;
	
	
	public List<Db> getAllDbs()
	{
		return repository.findAll();
	}
	
	public void saveDb(Db d) {
		repository.save(d);
	}

	public void deleteDb(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
}
