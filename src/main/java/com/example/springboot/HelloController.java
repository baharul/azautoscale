package com.example.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/health")
	public String index() {
		return ("Release Version V-12 is running . Feature-1 Edit");
	}


//	@GetMapping("/")
//	ResponseEntity<String> hello() {
//		return new ResponseEntity<>("Service is Down", HttpStatus.SERVICE_UNAVAILABLE);
//	}
}






