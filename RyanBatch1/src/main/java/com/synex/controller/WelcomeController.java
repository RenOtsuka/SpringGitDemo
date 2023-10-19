package com.synex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	//first change by sts
	//second change by desktop...
	
	@RequestMapping(value="/welcome",method = RequestMethod.GET)
	public String welcome() {
		return "Hey Welcome";
	}
	
}
