package com.polymorphisam;


class Person{
		public void printPerson(Person p) {
			System.out.println("Person Method");
		} 
}
class Employee extends Person{
	//static will make you normal method and not override method
	//input parameters should be same
		@Override
		public void printPerson(Person p) {
			System.out.println("Employee method");
		}
	
}
public class TestPolymorphisam {
	public static void main(String[] args) {
		Person e=new Employee();
		Person e2=new Employee();
		e.printPerson(e2);
		
		Employee e3=new Employee();
		Person e4=new Employee();
		e3.printPerson(e4);
		
		Person e5=new Employee();
		Employee e6=new Employee();
		e5.printPerson(e6);
	}
}
