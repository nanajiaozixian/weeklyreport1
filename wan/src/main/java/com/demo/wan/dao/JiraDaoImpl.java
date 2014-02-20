package com.demo.wan.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JiraDaoImpl implements BaseDao{

	private final static Logger logger = Logger.getLogger(JiraDaoImpl.class);

	@Resource(name = "jdbcTemplate_jira")
	protected JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public <T> List<T> query(String sql, RowMapper<T> rowMapper) {
		return jdbcTemplate.query(sql, rowMapper);
	}
	
	public <T> List<T> query(String sql,Object[] args ,RowMapper<T> rowMapper){
		return jdbcTemplate.query(sql, args, rowMapper);
	}
	
	public <T> List<T> query(String sql,RowMapper<T> rowMapper,Object... args){
		return jdbcTemplate.query(sql,rowMapper,args);
	}
	
	public <T> List<T> query(String sql,Object[] args,int[] argTypes,RowMapper<T> rowMapper){
		return jdbcTemplate.query(sql, args, argTypes, rowMapper);
	}
	
	public int queryForInt(String sql){
		return jdbcTemplate.queryForInt(sql);
	}
	
	public int queryForInt(String sql,Object... args){
		return jdbcTemplate.queryForInt(sql, args);
	}
	
	public int queryForInt(String sql,Object[] args,int[] argTypes){
		return jdbcTemplate.queryForInt(sql, args, argTypes);
	}
	
	public int update(String sql){
		return jdbcTemplate.update(sql);
	}
	
	public int update(String sql,Object... args){
		return jdbcTemplate.update(sql, args);
	}
	
	public int update(String sql,Object[] args,int[] argTypes){
		return jdbcTemplate.update(sql, args, argTypes);
	}
	
	
}
