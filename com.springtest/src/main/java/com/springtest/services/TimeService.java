package com.springtest.services;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

	@Value("${app.time}")
	boolean is24;

	public TimeService() {
		super();
	}

	public String getCurrentTime() {

		Date currentDate = new Date();
		SimpleDateFormat formatter;

		if (is24) {
			formatter = new SimpleDateFormat("HH:mm:ss");
		} else {
			formatter = new SimpleDateFormat("hh:mm:ss");
		}

		return formatter.format(currentDate);
	}

}
