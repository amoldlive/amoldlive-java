package com.java8;

interface A {
	public void show();
	
	public default void show(int i) {
		System.out.println("A - I "+i);
	}
	
	public static void show(String message) {
		System.out.println("A- Message >> "+message);
	}
	
}

interface B {
	public void show();
	
	public default void show(int i) {
		System.out.println("B - I "+i);
	}
	
	public static void show(String message) {
		System.out.println("B- Message >> "+message);
	}
}

public class DimondProblemTest implements A , B{
	public static void main(String[] args) {
		
		DimondProblemTest d=new DimondProblemTest();
		d.show();
		d.show(5);
		
	}

	@Override
	public void show() {
		//need to provide implementation
		System.out.println("Normal Abstract Method");
	}

	@Override
	public void show(int i) {
		A.super.show(i);
		//OR
		B.super.show(i);
	}
	
	// No need to implement static methods
}
