package com.project.dbConnect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class service {

	@Autowired
	 JdbcTemplate dataTemplate;
	
	public List<POJO> Data() {
		return dataTemplate.query("SELECT agreement_no,zone FROM SAMPLE_TABLE1 ",
				new BeanPropertyRowMapper<POJO>(POJO.class)); 
	}
	
	public String hello() {
		return "HI TEAM";
	}
	
	public List<POJO> save(POJO user) {
		return dataTemplate.query("SELECT * FROM SAMPLE_TABLE1 ",
				new BeanPropertyRowMapper<POJO>(POJO.class));
	}
	
	
	 
}
