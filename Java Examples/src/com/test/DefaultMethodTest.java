package com.test;
class A{
	public void show() {
		System.out.println("A-Show");
	}
}
interface B{
	public default void show() {
		System.out.println("B-show");
	}
	
}
public class DefaultMethodTest extends A implements B {
	public static void main(String[] args) {
		DefaultMethodTest t1=new DefaultMethodTest();
		t1.show();
	}
}
