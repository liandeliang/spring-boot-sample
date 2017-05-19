package com.pkrss.server.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface AService {
	@RequestMapping(value="/aString", method=RequestMethod.GET)
	String getAString();
}