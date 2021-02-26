package com.spd.ms.limitsserivices.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spd.ms.limitsserivices.bean.Limits;
import com.spd.ms.limitsserivices.configuration.LimitsConfiguration;

@RestController
public class LimitsController {
		
	@Autowired
	private LimitsConfiguration configuration;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		//return new Limits(1, 1000);
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}
	
}
