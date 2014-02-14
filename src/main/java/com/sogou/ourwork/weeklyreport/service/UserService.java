package com.sogou.ourwork.weeklyreport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sogou.ourwork.weeklyreport.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public boolean hasMatchUser(String userName, String password){
		int matchCount=userDao.getMatchCount(userName, password);
		return matchCount>0;
	}
}
