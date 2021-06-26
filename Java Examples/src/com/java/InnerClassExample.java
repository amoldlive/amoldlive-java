package com.java;

import com.java.Full.half;

class Outer{
	
	class Inner{
		
	//	public static void main(String[] args) { }   // cant declare static methods and reference
		
	// 
		int x=10;
		public void m1() {
			int y=10;
			
			class inner2{
				
				public void m1() {
					System.out.println(y); 
				}
				
			}
			
			inner2 i=new inner2();
			i.m1();
		}
		
		
	}
	public static void main(String[] args) {
		Outer.Inner i=new Outer().new Inner();
		i.m1();
	}
}


class Full{
	
	static class half{
		
		public void m1() {
			System.out.println(this.getClass().getName());
		}
		
	}
	
}

public class InnerClassExample {
	
	public static void main(String[] args) {
		
		Outer o=new Outer();
		Outer.Inner i= new Outer().new Inner();
		i.m1();
		
		half h=new half(); // can exist without outer class
		h.m1();
		
	}
	
}
