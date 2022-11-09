package com.project.dbConnect;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.model.Case;
import com.project.model.Statusentity;


@Repository
public class service {
	
	List<POJO> data = null;

	@Autowired
	 JdbcTemplate dataTemplate;
	
	@Autowired
	Case cases;
	
	
	
	String query1 = "SELECT agreement_no,zone FROM SAMPLE_TABLE1 ";
	
	
	public Case Data() {
		
				List<POJO> data = dataTemplate.query(query1,new BeanPropertyRowMapper<POJO>(POJO.class));
				
			List<Statusentity> statusEntityList=new ArrayList<>();
			Case cases=new Case();
				
				for (POJO obj:data)
				{
					Statusentity entity=new Statusentity(obj.getagreement_no(), obj.getZONE());
					statusEntityList.add(entity);
					
				}
				
				/*System.out.println("size--------------------------->" + data.size());
				
				for(Statusentity entity:statusEntityList) {
					
					System.out.println("size--------------------------->" + entity.getId()+"--->"+entity.getZone());
					
				}
				*/
				cases.setId("Batch1");
				cases.setStatusentity(statusEntityList);
				return cases;
	}
	
	public List<POJO> hello() {
		return data;
	}
	
	public List<POJO> save(POJO user) {
		return dataTemplate.query("SELECT * FROM SAMPLE_TABLE1 ",
				new BeanPropertyRowMapper<POJO>(POJO.class));
	}
	
	
	 
}
