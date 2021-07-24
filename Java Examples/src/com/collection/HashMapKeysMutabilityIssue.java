package com.collection;

import java.util.HashMap;
import java.util.Objects;

final class Person {
	private String name;

	public void setName(String name) {
		// if(this.name==null) // can checkdata
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person that = (Person) o;
		return name.equals(that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

}

public class HashMapKeysMutabilityIssue {
	public static void main(String[] args) {

		HashMap<Person, Integer> map = new HashMap<Person, Integer>();
		Person p = new Person();
		p.setName("Amol");
		map.put(p, 1);
		System.out.println(map.get(p)); // 1

		p.setName("Roy");
		System.out.println(map.get(p)); // null

	}
}
