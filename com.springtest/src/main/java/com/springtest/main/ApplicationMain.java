package com.springtest.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springtest.config.ApplicationConfig;
import com.springtest.services.OutSourceService;

public class ApplicationMain {
	public static void main(String[] args) throws InterruptedException {
		//picking environment variables
		// environmental varuiables have high priority than property file.
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		OutSourceService outSourceService = context.getBean(OutSourceService.class);

		for (int i = 0; i < 5; i++) {
			outSourceService.doProgress();
			Thread.sleep(1000);
		}
		System.out.println("Application process End *****  ");
	}
}
