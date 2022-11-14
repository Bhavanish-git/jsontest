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
	
	@Autowired JdbcTemplate dataTemplate;
	@Autowired Case cases;
	
	List<POJO> data = null;
	String query1 = "SELECT AGREEMENT_NO,ZONE FROM SAMPLE_TABLE1 WHERE WSO2_STATUS='UNPROCESSED' AND  ROWNUM<=100 ";
	
	public Case Fetch_Data() {
		
			List<POJO> data = dataTemplate.query(query1,new BeanPropertyRowMapper<POJO>(POJO.class));
			List<Statusentity> statusEntityList=new ArrayList<>();
			Case cases=new Case();
				
			for (POJO obj:data)
			{
				Statusentity entity=new Statusentity(obj.getagreement_no(), obj.getZONE());
				statusEntityList.add(entity);	
			}
						/*System.out.println("size--------------------------->" + data.size());		
						for(Statusentity entity:statusEntityList) 
						{										
							System.out.println("size--------------------------->" + entity.getId()+"--->"+entity.getZone());
						}*/
			
			cases.setId("Batch1");
			cases.setStatusentity(statusEntityList);
			return cases;
	}
		 
}
