package com.springtest.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	@Value("${app.name}")
	private String name;

	@Value("${app.greeting}")
	private String greeting;

	public GreetingService() {
		super();
	}

	public String getMessage() {
		return greeting;
	}

	public String getName() {
		return name;
	}
}
