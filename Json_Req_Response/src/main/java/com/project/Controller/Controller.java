package com.project.Controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.project.model.Case;
import com.project.model.CaseRequest;
import com.project.dbConnect.service;


@RestController
public class Controller {
	
	String status="";
	
	/*passing list of json object  */
	
    @PostMapping(path = "status",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    
    public String Request(@RequestBody String json) throws Exception {
    	
    	
       
    	//System.out.println("request--------->"+json);
    	RestTemplate restTemplate2 = new RestTemplate();

    	String urlString2 = "https://cholamandalam--tst1.custhelp.com/determinations-server/batch/12.2.7/policy-models/NEWSAMPLEPROJECT/assessor/";
        URI uri = new URI(urlString2);
    	
    	HttpHeaders headers2 = new HttpHeaders();
    	headers2.setContentType(MediaType.APPLICATION_JSON);

    	HttpEntity<String> entity2 = new HttpEntity<String>(json,headers2);
    	String answer = restTemplate2.postForObject(uri, entity2, String.class);
    	System.out.println("answer -----------> "+answer);
    	
    	
		//String ans = restTemplate2.postForObject(uri, entity2, String.class) ;
    	
    	//JSONObject json1=new JSONObject(answer);
    	
    	//JSONArray jarray=json1.getJSONArray("cases");
    	//System.out.println("::::"+jarray);
    	
    	JSONObject jsonObj = new JSONObject(answer);

    	JSONArray ja_data = jsonObj.getJSONArray("cases");
    	
    	//int length = jsonObj.length();
    	//System.out.println("Length  = "+length);
    	
    	//for(int i=0; i<length-2; i++) {
    		
    	  JSONObject jsonObj1 = ja_data.getJSONObject(0);
    	  JSONArray ja = jsonObj1.getJSONArray("statusentity");
    	  int len = ja.length();

    	  ArrayList<String> id_status = new ArrayList<>();
    	  System.out.println("Len  = "+len);
    	  for(int j=0; j<len; j++) {
    	    JSONObject jsonz = ja.getJSONObject(j);
    	    System.out.println(jsonz);
    	    id_status.add(jsonz.getString("ACTIVE_STATUS"));
    	    
    	  }
    	 
    //	}
		return answer;
    }
    
   // ==========================================JDBC=====================================
    
    @Autowired(required = true) service serv;
  
    @GetMapping("/response")
		public String table() {
    	
    	String apiResponse="";
    	
    	CaseRequest caseRequest=new CaseRequest();
    	
    	List <Case> casesList=new ArrayList<Case>();
    	casesList.add(serv.Data());
    	caseRequest.setCases(casesList);
    	
    	List <String> outcome=new ArrayList<String>();
    	outcome.add("ACTIVE_STATUS");
    	
    	caseRequest.setOutcomes(outcome);
    	
    	Gson gson = new Gson();
    	String json = gson.toJson(caseRequest);
    	
    	
    	
		try {
			apiResponse=  Request(json);
		} catch (Exception e) {
			e.printStackTrace();
			apiResponse="";
		}
		return apiResponse;		
	}
  
		
	//============================================  JPA    ================================
		
	
    
   


    /*====================================  working code for get method  =====================================================
    			
    	ResponseEntity<String> responseEntity = null ;
    	
    	String urlString = "http://127.0.0.1:8080/gallop/";

    	RestTemplate restTemplate = new RestTemplate();
        
    	URI uri = new URI(urlString);
    	 
    	ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
    	     
    	return result;
    	
    ==========================================================================================================================*/
    

}
