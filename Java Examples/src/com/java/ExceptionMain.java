package com.java;

class MyRuntimeException extends RuntimeException {

	public MyRuntimeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MyRuntimeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyRuntimeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyRuntimeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

class MyCheckedException extends Exception{
	public MyCheckedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MyCheckedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyCheckedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyCheckedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}

class Flower{
	String name;
	public Flower(String name) throws MyCheckedException{
		if(name.equalsIgnoreCase("ad"))
			throw new MyCheckedException("Invalid Name");
			else 
				this.name=name;
	}
	@Override
	public String toString() {
		return "Flower [name=" + name + "]";
	}
	
	
}

public class ExceptionMain {
	public static void main(String[] args) throws MyCheckedException {
			
		//throw new MyRuntimeException("My new Runtime Exception");
		
		Flower flower=new Flower("AD");
		System.out.println(flower);
		
		
	}
}
