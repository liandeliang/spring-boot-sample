package com.pkrss.server.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pkrss.server.service.BService;

@RestController
public class BServiceImpl implements BService {

	@RequestMapping(value="/bString", method=RequestMethod.GET)
	@Override
	public String getBString() {
		return "BString";
	}

}
