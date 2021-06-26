package com.java;

import java.util.Date;

final class Person {

	private int id;
	private String name;
	private Date date;
	
	

	public Person(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = (Date) date.clone();
	}

	

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", date=" + date + "]";
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return (Date) date.clone();
	}
	
	

}

public class ImmutableExample {
	public static void main(String[] args) {
			Person p1=new Person(1,"AMOL",new Date());
			System.out.println(p1);
			p1.getDate().setYear(1993);
			
			//p1.name="ROY";
			System.out.println(p1);
			//int i=new Integer(10); / /Auto -unboxiung
	}
}
