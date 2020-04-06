package com.newer.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="student")
public class Student {
	@Id
	@Column(name="stuid")
	private Integer  stuid;
	@Column(name="stuname")
	private String   stuname;
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public Student(Integer stuid, String stuname) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
	}
	public Student() {
		
	}
	
	
	
	
	

}
