package com.java8;

interface Message{
	void printMessage();
}

class Talk{
	
	public Talk() {
		System.out.println("Constructor is talking to you");
	}
	
	public void talk() {
		System.out.println("talking to you");
	}
	public static void talk2() {
		System.out.println("talking to you");
	}
}
public class MethodReference {
	public static void main(String[] args) {
		
		//static refrence
		Message msg1=Talk::talk2;
		msg1.printMessage();
		
		//instance Method Refrence
		Message msg2=new Talk()::talk;
		msg2.printMessage();
		
		//constructor reference
		Message msg3=Talk::new;
		msg3.printMessage();
	}
}
