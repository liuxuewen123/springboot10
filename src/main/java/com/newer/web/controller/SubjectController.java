package com.newer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.domain.PageDto;
import com.newer.domain.Subject;
import com.newer.service.SubjectService;

@RestController
@CrossOrigin
@RequestMapping("Subject")
public final class SubjectController {
	
@Autowired
private  SubjectService  subjectService;
	
	
	@RequestMapping("selectAll")
	public  PageInfo<Subject> selectAll(PageDto page){
		
		PageInfo<Subject>  paginfo=subjectService.selectAll(page);
		System.out.println(paginfo);
		return  paginfo;
	
	};
	

}
