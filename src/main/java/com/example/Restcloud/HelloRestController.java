package com.example.Restcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/")
	public String hello() {
	  return "Hello & Welcome to Aws Ankit !!!";
	}

}
