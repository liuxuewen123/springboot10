package com.newer.web.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.newer.domain.PageDto;
import com.newer.domain.User;
import com.newer.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("User")
public class UserController {
	
	@Autowired
	private  UserService userService;
	
@RequestMapping("login")	
	public User login(User user) {
	
		return this.userService.login(user.getUname(),user.getUpwd());
	}

@RequestMapping("selectAll")	
public PageInfo<User> selectAll(PageDto  page) {
	return userService.selectAll(page) ;
	
}

@RequestMapping("update")	
public int update(User user ) {
	return userService.update(user) ;
	
}

@RequestMapping("save")	
public int save(User user ) {
	return userService.save(user) ;
	
}

@RequestMapping("delete")	
public int delete(int id ) {
	return userService.delete(id) ;
	
}


@RequestMapping("deletes")	
public int delete(int arr[]  ) {
	System.out.println(arr);
	return  0;
}
@RequestMapping("upload")
public String upload(MultipartFile img,HttpSession session)throws Exception {
	 String realpath=session.getServletContext().getRealPath("\\img");
		//得到源文件名
	 
	 File file=new File(realpath);
		if(!file.exists()){
			file.mkdir();
		}
		String oldName=img.getOriginalFilename();
		//得到扩展名
		
		String extName=oldName.substring(oldName.lastIndexOf("."));
		//UUID命名为新的文件名
		String newName=UUID.randomUUID().toString()+extName;
		//最后存储路径
		realpath+="/"+newName;
		//实现文件上传
		img.transferTo(new File(realpath));	
	System.out.println(newName);
	return newName;
}











}
