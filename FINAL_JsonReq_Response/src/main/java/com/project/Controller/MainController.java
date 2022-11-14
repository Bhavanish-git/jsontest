package com.project.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired(required=true) ControllerService cont;
	
	
	@RequestMapping("/response")
	@Scheduled(fixedRate = 5000 )
	public String response() throws IOException {
		return cont.Response();
	}

}
