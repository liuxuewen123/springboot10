package com.newer.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.domain.Student;
import com.newer.service.StudentService;

@RestController
@CrossOrigin
@RequestMapping("student")
public class StudentController{
	
	@Autowired
	private  StudentService  studentservice;
	
	
	@RequestMapping("selectAll")	
	public  List<Student>  selectAll(){
		return  this.studentservice.selectAll();
	
	};
	
	
	
	

}
