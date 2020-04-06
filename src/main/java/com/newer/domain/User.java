package com.newer.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user")
public class User {
	@Id
	private  Integer id;
	@Column(name="uname")
	private String uname;
	@Column(name="upwd")
	private  String upwd;
	@Column(name="img")
	private String img;
	
	
	public User() {
		
	}
	
	
	public User(Integer id, String uname, String upwd, String img) {
		super();
		this.id = id;
		this.uname = uname;
		this.upwd = upwd;
		this.img = img;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
	
	
	

}
