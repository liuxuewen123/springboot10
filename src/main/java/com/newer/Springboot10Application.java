package com.newer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.newer.dao")
public class Springboot10Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot10Application.class, args);
	}
	
	

}
