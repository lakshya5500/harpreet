package com.risk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiskController {

	
	@Autowired
	RiskService riskService;
	
	@GetMapping("/get")
	public ResponseEntity<List<RiskClass>> getAllData(){
		List<RiskClass> riskClass = riskService.getData();
		return new ResponseEntity<>(riskClass, HttpStatus.OK);
	}
}
