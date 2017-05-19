package com.pkrss.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkrss.server.feign.AClient;

@RestController
@RequestMapping("/b")
public class BController {
	private AClient aClient;
	
	@Autowired
	BController(AClient aClient){
		this.aClient = aClient;
	}
	
	@GetMapping("/a")
	public String getA(){
		return aClient.getAString();
	}
}
