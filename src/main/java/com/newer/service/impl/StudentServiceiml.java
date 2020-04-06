package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.dao.StudentMapper;
import com.newer.domain.Student;
import com.newer.service.StudentService;

@Service
public class StudentServiceiml implements StudentService {
	@Autowired
	private  StudentMapper  studao;

	@Override
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		return this.studao.selectAll();
	}

}
