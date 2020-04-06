package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.UserMapper;
import com.newer.domain.PageDto;
import com.newer.domain.User;
import com.newer.service.UserService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service
public class UserServiceimpl implements UserService {
@Autowired
private  UserMapper userdao;

	@Override
	public User login(String uname, String upwd) {
		// TODO Auto-generated method stub
		Example example=new Example(User.class);
        Criteria criteria=example.createCriteria();
        criteria.andEqualTo("uname",uname);
        criteria.andEqualTo("upwd",upwd);
		return userdao.selectOneByExample(example);
	}

	@Override
	public PageInfo<User> selectAll(PageDto page) {
	PageHelper.startPage(page.getPage(), page.getPageSize());
	
	List	list=null;
	if(page.getUname()==null|| "".equals(page.getUname())) {
	 list= this.userdao.selectAll(); 
	}else {
		Example example=new Example(User.class);
        Criteria criteria=example.createCriteria();
        criteria.andLike("uname","%"+page.getUname()+"%");
		list=this.userdao.selectByExample(example);
	}
     PageInfo<User> pageinfo=new PageInfo<User>(list);
     
		return pageinfo;
	}

	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		return this.userdao.insert(user);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return userdao.updateByPrimaryKeySelective(user);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return userdao.deleteByPrimaryKey(id);
	}

}
