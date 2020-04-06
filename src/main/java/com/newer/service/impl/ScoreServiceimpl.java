package com.newer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.dao.ScoreMapper;
import com.newer.domain.Score;
import com.newer.service.ScoreService;


@Service
public class ScoreServiceimpl implements ScoreService {
	@Autowired
	private  ScoreMapper  scoredao;

	@Override
	public int insert(Score score) {
		// TODO Auto-generated method stub
		return this.scoredao.insert(score);
	}
	
	

}
