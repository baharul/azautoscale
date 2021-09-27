package com.example.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/health")
	public ResponseEntity<String> index() {
		return new ResponseEntity<>("{\"Release Version V1.0 is Running!\" : \"Success\"}", HttpStatus.OK);
	}



//	@GetMapping("/")
//	ResponseEntity<String> hello() {
//		return new ResponseEntity<>("Service is Down", HttpStatus.SERVICE_UNAVAILABLE);
//	}
}






