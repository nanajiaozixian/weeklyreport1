package com.demo.wan.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao extends BaseDaoImpl{

	public int existUser(){
		String sql = "select count(*) from t_user ";
		int count = queryForInt(sql);
		return count;
	}
}
