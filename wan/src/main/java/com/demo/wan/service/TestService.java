package com.demo.wan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.wan.dao.TestDao;

@Service
public class TestService {

	@Autowired
	private TestDao testDao;
	
	public int gameCount(){
		return testDao.existUser();
	}
	
}
