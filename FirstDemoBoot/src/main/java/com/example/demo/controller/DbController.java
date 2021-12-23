package com.example.demo.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.service.DbService;
import com.example.demo.model.Db;
import com.example.demo.repository.DbRepository;

@RestController
@RequestMapping("/api")
public class DbController {
	
@Autowired 
DbService service;


@GetMapping("/GetDbs")
public List<Db> getAllDbs()
{
	return service.getAllDbs();
}

@PostMapping ("/Dbs")
public void saveDb(@RequestBody Db dd)
{
	 service.saveDb(dd);
}

@PostMapping ("/deleteDb/{id}")
public void deleteDb(@PathVariable String id)
{
	 service.deleteDb(id);
}
}
