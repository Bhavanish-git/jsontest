package com.project.Controller;

import java.net.URI;
import java.util.List;

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
import com.project.model.CaseRequest;

import com.project.dbConnect.POJO;
import com.project.dbConnect.service;


@RestController
public class Controller {
	
	String status="";
	Gson gson = new Gson();
	
	
	/*passing list of json object  */
	
    @PostMapping(path = "status",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    
        public String saveMultipleUsers(@RequestBody CaseRequest status) throws Exception {
    	//JSONObject obj=new JSONObject(status);
    	
    	Gson gson = new Gson();
    	String json = gson.toJson(status);
       
    
    	
    	System.out.println("request--------->"+json);
    	RestTemplate restTemplate2 = new RestTemplate();

    	//String urlString2 = "http://127.0.0.1:8080/addUsers";
    	
    	String urlString2 = "https://cholamandalam--tst1.custhelp.com/determinations-server/batch/12.2.7/policy-models/NEWSAMPLEPROJECT/assessor/";
        URI uri = new URI(urlString2);
    	
    	HttpHeaders headers2 = new HttpHeaders();
    	headers2.setContentType(MediaType.APPLICATION_JSON);

    	HttpEntity<String> entity2 = new HttpEntity<String>(json,headers2);
    	String answer = restTemplate2.postForObject(uri, entity2, String.class);
    	System.out.println(answer);
		return answer;
    }
    
    
    
   @Autowired(required = true)
    service temp;
    
    @GetMapping("/data")
	public List<POJO> table() {
		return  temp.Data();		
	}
   
		
		@RequestMapping("/hello")
		public String hey() {
			return "hello";
		}
    
   


    	/*====================================  working code for get method  =====================================================
    			
    	ResponseEntity<String> responseEntity = null ;
    	
    	String urlString = "http://127.0.0.1:8080/gallop/";

    	RestTemplate restTemplate = new RestTemplate();
        
    	URI uri = new URI(urlString);
    	 
    	ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
    	     
    	return result;
    	
    	==========================================================================================================================*/
    

}
