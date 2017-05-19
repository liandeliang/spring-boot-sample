package com.pkrss.server.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface BService {
	@RequestMapping(value="/bString", method=RequestMethod.GET)
	String getBString();
}
