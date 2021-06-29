package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

class Test {

	public void calc(int i, long j) {
		System.out.println("M1");
	}

	public void calc(Integer i, long j) {
		System.out.println("M2");
	}

	public void calc(Integer i, Long j) {
		System.out.println("M3");
	}

	public void calc(int i, Long j) {
		System.out.println("M4");
	}
}

class Animal {
	protected Animal getAnimal() throws IOException {
		return null;
	}

	final void show() {
	}

	synchronized void display() {
	}
}

class Cat extends Animal {

	@Override
	public Cat getAnimal() {
		return null;
	}

	/* final method can not be overriden */
	/* void show() {} */

	@Override
	void display() throws ArithmeticException {
		super.display();
	}
}

class Test3 {

	/* method name is case sensetive */
	private void show() {
	}

	private void Show() {
	}

	private void ShoW() {
	}

	public void show(int i) {
	}

	public int show(int i, int j) {
		return 0;
	}

}

public class HashExample {
	public static void main(String[] args) {
		HashSet<Employee> hashSet = new HashSet<>();
		Employee e1 = new Employee(1, "a");
		Employee e2 = new Employee(2, "b");
		Employee e3 = new Employee(3, "c");

		hashSet.add(e1);
		hashSet.add(e2);
		hashSet.add(e3);
		System.out.println(hashSet);

		HashMap<Employee, Integer> map = new HashMap<Employee, Integer>();
		map.put(e1, e1.getId());
		map.put(e2, e2.getId());
		map.put(e3, e3.getId());

		System.out.println(map);

		Test t1 = new Test();
		t1.calc(1, 4L);
		t1.calc(new Integer(1), 4L);
		t1.calc(1, new Long(4L));
		t1.calc(new Integer(1), new Long(4l));

	}
}
