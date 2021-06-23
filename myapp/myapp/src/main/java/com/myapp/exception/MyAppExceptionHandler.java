package com.myapp.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyAppExceptionHandler extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> handleAllException(Exception ex,WebRequest request) {
		ExceptionDescriiptor ed=new ExceptionDescriiptor(ex.toString(), request.getDescription(false), new Date().toLocaleString());
		return new ResponseEntity<Object>(ed, HttpStatus.BAD_REQUEST);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		ExceptionDescriiptor ed=new ExceptionDescriiptor(ex.toString(), "Validation Failed", new Date().toLocaleString());
		return new ResponseEntity<Object>(ed, HttpStatus.BAD_REQUEST);
	}
}
