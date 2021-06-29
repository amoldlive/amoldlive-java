package com.java;

public class ObjectCreation {

	/*
	 * 1. Using new keyword
	 * 2. Using newInstance() method  - reflection
	 * 3. Using clone
	 * 4. Using serialization , Deserialization
	 * 
	 * */
	private int a;
	public ObjectCreation(int a) {
		this.a=a;
	}
	
	public ObjectCreation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//way -1 using new keywork
		/*Creates different hashcode -> to create unique hashcode we need to override hashcode method*/
		for (int i = 0; i < 5; i++) {
			ObjectCreation c=new ObjectCreation(10);
			System.out.println(c.hashCode());
		}
		
		
		//way -2 using new Instance
		/*Needs default constructor*/
		try {
			ObjectCreation c=ObjectCreation.class.newInstance();
				System.out.println(c);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*Reflection - using newInstance()*/
		try {
			ObjectCreation c=(ObjectCreation) Class.forName("com.java.ObjectCreation").newInstance();
			System.out.println(c);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
