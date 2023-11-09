package com.example.demo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@EntityScan
@Data
public class Student {
	
	private String id;
	private String name;
	private String age;
	

}
