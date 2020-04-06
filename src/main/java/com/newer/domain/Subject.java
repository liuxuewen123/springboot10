package com.newer.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="Subject")
public class Subject {
	@Id
	@Column(name="subid")
	private  Integer  subid;
	@Column(name="subname")
	private String  subname;
	
	public Integer getSubid() {
		return subid;
	}
	public void setSubid(Integer subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public Subject(Integer subid, String subname) {
		super();
		this.subid = subid;
		this.subname = subname;
	}
	
	public Subject() {
		
	}
	@Override
	public String toString() {
		return "Subject [subid=" + subid + ", subname=" + subname + "]";
	}
	
	
	

}
