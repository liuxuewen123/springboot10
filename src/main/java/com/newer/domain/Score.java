package com.newer.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Score")
public class Score {
	@Id
	@Column(name="scid")
	private Integer  scid;
	@Column(name="stuid")
	private Integer  stuid;
	@Column(name="subid")
	private Integer   subid;
	@Column(name="score")
	private double   score;
	
	private int    number;
	
	public Integer getScid() {
		return scid;
	}
	public void setScid(Integer scid) {
		this.scid = scid;
	}
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public Integer getSubid() {
		return subid;
	}
	public void setSubid(Integer subid) {
		this.subid = subid;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Score(Integer scid, Integer stuid, Integer subid, double score) {
		super();
		this.scid = scid;
		this.stuid = stuid;
		this.subid = subid;
		this.score = score;
	}
	public Score() {
		
	}
	
	
	
	

}
