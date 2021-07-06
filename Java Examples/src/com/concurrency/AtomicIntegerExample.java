package com.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
	public static void main(String[] args) {
		AtomicInteger integer=new AtomicInteger(5);
		System.out.println(integer.incrementAndGet());
		System.out.println(integer.addAndGet(4));
		
	}
}
