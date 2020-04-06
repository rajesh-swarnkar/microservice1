package com.raj.limitservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.limitservice.bean.LimitConfiguraion;
import com.raj.limitservice.config.Configuration;

@RestController
public class LimitController {
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguraion getLimitConfiguration() {
		
	/*	List<String> str =null;
		System.out.println("size..."+str.size());*/
//		return (new LimitConfiguraion(Long.valueOf(10),Long.valueOf(5)));
		return (new LimitConfiguraion(configuration.getMax(),configuration.getMin()));
	}
	
}
