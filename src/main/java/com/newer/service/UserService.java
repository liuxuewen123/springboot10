package com.newer.service;

import com.github.pagehelper.PageInfo;
import com.newer.domain.PageDto;
import com.newer.domain.User;

public interface UserService {
	
	public User login(String uname,String upwd) ;
	public PageInfo<User> selectAll(PageDto page) ;
    public  int  save(User user);
    public  int  update(User user);
    public  int  delete(int id);
}
