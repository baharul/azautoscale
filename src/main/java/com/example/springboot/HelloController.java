package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/health")
	public String index() {
		return ("Release Version V-12 is running . Checking Autoscale logic!!");
	}

}
