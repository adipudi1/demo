package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RestTest {
	
	//@Autowired
	TestJson tJson;
	
	
	@Autowired
	public void settJson(TestJson tJson) {
		this.tJson = tJson;
	}
	
	@Autowired
	public RestTest(TestJson tJson1) {
		// TODO Auto-generated constructor stub
		
		this.tJson=tJson1;
	}

	@Autowired
	ObjectMapper objectMapper;
	
	@GetMapping(path = "/welcome2")
	public ResponseEntity<TestJson> welcome() throws JsonProcessingException{
		tJson.setName("Sriharsha");
		tJson.setAge(26);
		
		
		String s=objectMapper.writeValueAsString(tJson);
		System.out.println(s);
		return ResponseEntity.ok().body(tJson);
		
	}

}
