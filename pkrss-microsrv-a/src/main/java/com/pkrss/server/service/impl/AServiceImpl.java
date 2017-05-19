package com.pkrss.server.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pkrss.server.service.AService;

@RestController
public class AServiceImpl implements AService {

	@RequestMapping(value="/aString", method=RequestMethod.GET)
	@Override
	public String getAString() {
		return "AString";
	}

}
