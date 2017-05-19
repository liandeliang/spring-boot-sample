package com.pkrss.server.service.impl;

import org.springframework.web.bind.annotation.RestController;

import com.pkrss.server.feign.AClient;

@RestController
public class AServiceImpl implements AClient {

	@Override
	public String getAString() {
		return "AString";
	}

}
