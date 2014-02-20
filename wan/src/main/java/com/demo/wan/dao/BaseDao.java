package com.demo.wan.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

public interface BaseDao {

	public <T> List<T> query(String sql, RowMapper<T> rowMapper);
	
	public <T> List<T> query(String sql,Object[] args ,RowMapper<T> rowMapper);
	
	public <T> List<T> query(String sql,RowMapper<T> rowMapper,Object... args);
	
	public <T> List<T> query(String sql,Object[] args,int[] argTypes,RowMapper<T> rowMapper);
	
	public int queryForInt(String sql);
	
	public int queryForInt(String sql,Object... args);
		
	public int queryForInt(String sql,Object[] args,int[] argTypes);
	
	public int update(String sql);
	
	public int update(String sql,Object... args);
	
	public int update(String sql,Object[] args,int[] argTypes);
}
