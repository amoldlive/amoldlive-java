package com.java;

class A {
	public Object show() {
		System.out.println("obj");
		return null;
	}
}

class B extends A {
	@Override
	public String show() {
		// TODO Auto-generated method stub
		System.out.println("String");
		return null;
	}
}

class C extends A {
	@Override
	public Object show() {
		// TODO Auto-generated method stub
		return super.show();
	}
}

public class MethosOverriding {
	public static void main(String[] args) {
		
		C c=new C();
		B b=new B();
		// b=c; not possible
		
	}
}
