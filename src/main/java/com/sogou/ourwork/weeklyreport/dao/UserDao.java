package com.sogou.ourwork.weeklyreport.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int getMatchCount(String userName, String password){
		String sqlStr = "selct count(*) from t_user where user_name=? and password=?";
		return jdbcTemplate.queryForInt(sqlStr,new Object[]{userName, password});
	}
}
