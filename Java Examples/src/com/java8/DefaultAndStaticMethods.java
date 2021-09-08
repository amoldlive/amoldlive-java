package com.java8;

interface  Integrface1{
	
	void print();
	
	default void printData() {
		System.out.println("Default methods");		
	}
	
	static void logData() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
}
public class DefaultAndStaticMethods {
	public static void main(String[] args) {
		Integrface1.logData();
		Integrface1.main(null);
		
		//version 1
		Integrface1 i1=new Integrface1() {
			@Override
			public void print() {
				System.out.println("print method ");
			}
		};
		i1.print();
		
		//version 2
		Integrface1 i2=()-> {System.out.println("print method ");};
		i2.print();
		
		//version 3
		Integrface1 i3=()-> System.out.println("print method ");
		i3.print();

		//for default method you need to initialize interface reference
		i3.printData();
		
	}
}
