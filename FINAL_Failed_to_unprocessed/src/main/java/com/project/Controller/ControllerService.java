package com.project.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ControllerService {
	
	//--------------------------------------update the failed records -----> unprocessed----------------------------------------------
	
	@RequestMapping("/update")
	public String FailedToUnprocessed() {
	
	try {
    		Class.forName("oracle.jdbc.driver.OracleDriver");
			String mysqlUrl = "jdbc:oracle:thin:@mexacscifcl-sqmcv-scan.dbprimarysn.dbexacsvcn01.oraclevcn.com:1625/SITFIN_SITFIN_PDB.paas.oracle.com";
			Connection con = DriverManager.getConnection(mysqlUrl, "cholabre", "Welcome_789");
			System.out.println("Connection established......");
			
		try {
			
			PreparedStatement ps_update;				
			ps_update = con.prepareStatement("update sample_table1 set WSO2_status ='UNPROCESSED', STAMP = current_timestamp where WSO2_STATUS = 'FAILED'");
			ps_update.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			
			try {
				con.close();
			}catch(Exception e1) {
				System.out.println(e1.getLocalizedMessage());
			}	
	     }
		
	}catch(Exception e2) {
		System.out.println(e2.getLocalizedMessage());
							
	}
	
										
			System.out.println(".........failed --> unprocessed............");
									
			return "failed --> unprocessed";	
	}
	
	//----------------------  update the records between the given range  to UNPROCESSED  --------------------------------------
	
	@RequestMapping(path="/date/{S_DATE}/{E_DATE}")
	public String UpdateWithDate(@PathVariable("S_DATE") String S_DATE,
                                  @PathVariable("E_DATE") String E_DATE) {
	
	try {
    		Class.forName("oracle.jdbc.driver.OracleDriver");
			String mysqlUrl = "jdbc:oracle:thin:@mexacscifcl-sqmcv-scan.dbprimarysn.dbexacsvcn01.oraclevcn.com:1625/SITFIN_SITFIN_PDB.paas.oracle.com";
			Connection con = DriverManager.getConnection(mysqlUrl, "cholabre", "Welcome_789");
			System.out.println("Connection established......");
			
		try {
			
			PreparedStatement ps_date;				
			ps_date = con.prepareStatement("UPDATE SAMPLE_TABLE1 SET WSO2_STATUS = 'UNPROCESSED' where STAMP >= '"+S_DATE +"' and STAMP <=  '"+E_DATE+"' ");
			ps_date.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			
			try {
				con.close();
			}catch(Exception e1) {
				System.out.println(e1.getLocalizedMessage());
			}	
	     }
		
	}catch(Exception e2) {
		System.out.println(e2.getLocalizedMessage());
							
	}
	
										
			System.out.println(".........given dates --> processed............");
									
			return "given dates --> processed";	
	}
	
	//------------------------------Update the records for the given date to UNPROCESSED-------------------------------------------------
	
	@RequestMapping(path="/date/{S_DATE}")
	public String UpdateWithFromToDate(@PathVariable("S_DATE") String S_DATE) {
		
		
	
	try {
    		Class.forName("oracle.jdbc.driver.OracleDriver");
			String mysqlUrl = "jdbc:oracle:thin:@mexacscifcl-sqmcv-scan.dbprimarysn.dbexacsvcn01.oraclevcn.com:1625/SITFIN_SITFIN_PDB.paas.oracle.com";
			Connection con = DriverManager.getConnection(mysqlUrl, "cholabre", "Welcome_789");
			System.out.println("Connection established......");
			
		try {
			
			PreparedStatement ps_date;				
			ps_date = con.prepareStatement("UPDATE SAMPLE_TABLE1 SET WSO2_STATUS = 'UNPROCESSED' where STAMP >= '"+S_DATE +"' ");
			ps_date.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			
			try {
				con.close();
			}catch(Exception e1) {
				System.out.println(e1.getLocalizedMessage());
			}	
	     }
		
	}catch(Exception e2) {
		System.out.println(e2.getLocalizedMessage());
							
	}
	
										
			System.out.println(".........given date --> processed............");
									
			return "given date --> processed";	
	}
	
	
	
	
	
	
    	
} 

  