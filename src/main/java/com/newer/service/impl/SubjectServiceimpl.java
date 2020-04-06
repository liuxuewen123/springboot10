package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.SubjectMapper;
import com.newer.domain.PageDto;
import com.newer.domain.Subject;
import com.newer.service.SubjectService;

@Service
public class SubjectServiceimpl implements SubjectService {
	@Autowired
private   SubjectMapper  subjectdao;

	@Override
	public PageInfo<Subject> selectAll(PageDto page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page.getPage(), page.getPageSize());
		       List list=subjectdao.selectAll();
		       System.out.println(list);
		       PageInfo<Subject> paginfo=new PageInfo<Subject>(list);
		          return paginfo;
	}

}
