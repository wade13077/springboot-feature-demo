package com.wade.springboot.springboot_feature_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wade.springboot.springboot_feature_demo.CurrencyServiceConfiguration;

@RestController
public class CurrencyConfigurationController {

	@Autowired
	private CurrencyServiceConfiguration configuration;

	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses() {
		return configuration;
	}

}