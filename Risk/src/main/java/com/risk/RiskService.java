package com.risk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiskService {

	@Autowired
	RiskRepository RiskRepository;

	public List<RiskClass> getData() {
		return RiskRepository.findAll();
	}
}