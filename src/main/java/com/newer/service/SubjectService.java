package com.newer.service;

import com.github.pagehelper.PageInfo;
import com.newer.domain.PageDto;
import com.newer.domain.Subject;

public interface SubjectService {
	
	public  PageInfo<Subject> selectAll(PageDto page);

}
