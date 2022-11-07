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
	
	String query1 = "SELECT agreement_no,zone FROM SAMPLE_TABLE1 ";
	
	
	public List<POJO> Data() {
		
				List<POJO> data = dataTemplate.query(query1,new BeanPropertyRowMapper<POJO>(POJO.class));
				
				for (POJO obj:data)
				{
					System.out.println("list : "+obj.getagreement_no()+" "+obj.getZONE());
				}
				
				System.out.println("size--------------------------->" + data.size());
				
				return data;
	}
	
	public String hello() {
		return "HI TEAM";
	}
	
	public List<POJO> save(POJO user) {
		return dataTemplate.query("SELECT * FROM SAMPLE_TABLE1 ",
				new BeanPropertyRowMapper<POJO>(POJO.class));
	}
	
	
	 
}
