package com.test;
class Apple{
	public static void show(String str) {
		System.out.println("Apple static method "+ str);
	}
	public void show(int i) {
		System.out.println("Apple non static method "+ i);
	}
}
interface Fruit{
	public static void show(String str) {
		System.out.println("Interface static method "+ str);
	}
}
class MiniApple extends Apple implements Fruit{
	
}

class Test2{
	
	public static void getS1() {
		System.out.println("Hii");
	}
}
public class StaticTest {
	public static void main(String[] args) {
		Test2 t=null;
		t.getS1();
	
		MiniApple.show("a"); // Apple class method will be called // interface static method is not available to child classes
	}
}
