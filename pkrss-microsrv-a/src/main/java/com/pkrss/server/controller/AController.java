package com.pkrss.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkrss.server.feign.BClient;

@RestController
@RequestMapping("/a")
public class AController {
	private BClient bClient;
	
	@Autowired
	AController(BClient bClient){
		this.bClient = bClient;
	}
	
	@GetMapping("/b")
	public String getB(){
		return bClient.getBString();
	}
}
