package com.pkrss.server.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pkrss.server.feign.AClient;

@RestController
public class AServiceImpl implements AClient {

	@RequestMapping(value="/aString", method=RequestMethod.GET)
	@Override
	public String getAString() {
		return "AString";
	}

}
