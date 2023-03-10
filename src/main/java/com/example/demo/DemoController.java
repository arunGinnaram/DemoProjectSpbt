package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

	@RequestMapping(value= "/" , method = RequestMethod.GET)
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<>("Welcome",HttpStatus.OK);
	}
}
