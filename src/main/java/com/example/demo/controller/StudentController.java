package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RequestMapping("/request")
@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping(path = "/student")
	public String GetStudents()
	{
		return service.getStudent();
		
	}
	
	
	public void test()
	{
//		l;kasd
		
	}

}
