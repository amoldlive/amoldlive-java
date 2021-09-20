package com.oops;

class Person {
	int age;
	String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		System.out.println("Person [age=" + age + ", name=" + name + "]");
		return "Person [age=" + age + ", name=" + name + "]";
	}

}

public class SwapObjectsGame {
	public static void main(String[] args) {

		Person p1 = new Person(10, "Amol");
		Person p2 = new Person(20, "Dipalini");
		p1.toString();
		p2.toString();
		Swap(p1, p2);
		p1.toString();
		p2.toString();

		// output - no swapping for data | only references swaps at memory
		// -----------------------------------------------------------------
		// Person [age=10, name=Amol]
		// Person [age=20, name=Dipalini]
		// Person [age=10, name=Amol]
		// Person [age=20, name=Dipalini]

		System.out.println("***************************************");

		p1.toString();
		p2.toString();
		Swap2(p1, p2);
		p1.toString();
		p2.toString();

		// output - swapping data
		// -----------------------------------------------------------------
		// Person [age=10, name=Amol]
		// Person [age=20, name=Dipalini]
		// Person [age=20, name=Amol]
		// Person [age=10, name=Dipalini]

		System.out.println("***************************************");

		p1.toString();
		p2.toString();
		Swap3(p1, p2);
		p1.toString();
		p2.toString();

		// output 
		// -----------------------------------------------------------------
		// Person [age=20, name=Amol]
		// Person [age=10, name=Dipalini]
		// ->
		// Person [age=20, name=Amol]
		// Person [age=0, name=Dipalini]
	}

	private static void Swap3(Person p1, Person p2) {
		p1 = new Person(0, null);

		int age = p1.age;
		p1.age = p2.age;
		p2.age = age;

		p2 = new Person(0, null);
		age = p2.age;
		p2.age = p1.age;
		p1.age = age;

	}

	private static void Swap2(Person p1, Person p2) {

		int age = p1.age;
		p1.age = p2.age;
		p2.age = age;

	}

	private static void Swap(Person p1, Person p2) {
		Person temp = p1;
		p1 = p2;
		p2 = temp;

	}
}
