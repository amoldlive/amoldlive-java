package com.java;

import java.util.HashSet;
import java.util.Set;

class Employee {
	private int id;
	private String name;

	
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

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	

}

public class HashcodeEqualsExample {
	public static void main(String[] args) {
		
		Employee e1=new Employee(1, "Amol");
		Employee e2=new Employee(1, "Amol");
		
		System.out.println("e1.equals(e2) : "+e1.equals(e2));
		
		Set<Employee> se=new HashSet<>();
		se.add(e1);
		se.add(e2);
		
		System.out.println(se);
	}
}
