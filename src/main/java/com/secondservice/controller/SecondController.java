package com.secondservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
@CrossOrigin(origins = "*")
public class SecondController {

	@GetMapping
	public ResponseEntity<String> getMessage(){
		return new ResponseEntity<String>("hello!!!!! From second Service", HttpStatus.OK);
	}
	
	
	@GetMapping("/new")
	public ResponseEntity<String> getNewMessage(){
		return new ResponseEntity<String>("Yo Bro new Second Service MSG!!!!!", HttpStatus.OK);
	}
	
}
