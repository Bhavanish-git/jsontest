package com.project.Controller;

import java.net.URI;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.model.Example;

@RestController
public class Controller {
	
	String status="";
	
	/*passing list of json object  */
	
    @PostMapping(path = "status",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    
    public String  saveMultipleUsers(@RequestBody Example status) throws Exception {
       
    	JSONObject obj=new JSONObject(status);
    	RestTemplate restTemplate2 = new RestTemplate();

    	//String urlString2 = "http://127.0.0.1:8080/addUsers";
    	
    	String urlString2 = "https://cholamandalam--tst1.custhelp.com/determinations-server/batch/12.2.7/policy-models/NEWSAMPLEPROJECT/assessor/";
    	URI uri = new URI(urlString2);
    	
    	
    	HttpHeaders headers2 = new HttpHeaders();
    	headers2.setContentType(MediaType.APPLICATION_JSON);

    	HttpEntity<String> entity2 = new HttpEntity<String>(obj.toString(),headers2);
    	ResponseEntity<String> answer = restTemplate2.exchange(uri,HttpMethod.POST, entity2, String.class);
    	System.out.println(answer);
    	
		return answer.toString();
    	
      
  
    	/*working code for get method==================
    			
    	  ResponseEntity<String> responseEntity = null ;
    	
    	String urlString = "http://127.0.0.1:8080/gallop/";
    	
    
    	RestTemplate restTemplate = new RestTemplate();
        
    
    	URI uri = new URI(urlString);
    	 
    	ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
    	     
    	return result;
    	
    	=================*/
    }

}
