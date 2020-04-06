package com.newer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.domain.Score;
import com.newer.service.ScoreService;

@RestController
@CrossOrigin
@RequestMapping("Score")
public class ScoreController {
	@Autowired
  private 	ScoreService   scoreservice;
	
	
	@RequestMapping("insert")
	public  int  insert(Score score) {
		System.out.println(score.getStuid());
		System.out.println(score.getSubid());
		return  this.scoreservice.insert(score);
		
	};

}
