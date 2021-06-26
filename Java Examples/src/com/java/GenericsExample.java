package com.java;

public class GenericsExample {
	public static void main(String[] args) {

		Type<String> t1=new Type();
		t1.addValue("Amol");
		System.out.println(t1.get());
	}
}
class Type<T>{
	
	T t;
	public void addValue(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}
	
}
