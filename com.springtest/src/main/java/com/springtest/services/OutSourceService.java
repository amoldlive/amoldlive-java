package com.springtest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutSourceService {
	
	private GreetingService greetingService;
	private TimeService timeService;

	@Autowired
	public OutSourceService(GreetingService greetingService, TimeService timeService) {
		this.greetingService = greetingService;
		this.timeService = timeService;
	}
	
	public void doProgress() {
		System.out.println(timeService.getCurrentTime() +"  -  "+ greetingService.getMessage() +"  -  "+greetingService.getName());
	}
}
