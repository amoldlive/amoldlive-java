package com.test;
import java.util.HashMap;
import java.util.TreeMap;

class TestMethods{
	
	public void tets1() {
		//static int i=0;
		//static not permited
	}
	public static void test2() {
		//static int i=0;
		//static not permited
	}
	
}
class TestHashcodeEquals {
	
	String name;
	int id;
	boolean booleans;
	double avg;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (booleans ? 1231 : 1237);
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
		TestHashcodeEquals other = (TestHashcodeEquals) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (booleans != other.booleans)
			return false;
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
class Student implements Comparable<Student>{
	String name;
	int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.id==o.id)return 0 ;
		else if(this.id > o.id) return 1 ;
		else return -1;
		
	}
	
}
public class TestCode {
	public static void main(String[] args) {
		final int a=1;
		int b=6;
		//a=b;
		
		Student s1=new Student("A", 1);
		Student s2=new Student("B", 2);
		Student s3=new Student("C", 3);
		Student s4=new Student("A", 1);
		
		HashMap<Student, Integer> map=new HashMap<Student, Integer>();
		
		map.put(s1, 1);
		map.put(s2, 2);
		map.put(s3, 3);
		map.put(s4, 4);
		
		System.out.println(map);
		
		TreeMap<Student, Integer> tmap=new TreeMap<Student, Integer>();
		tmap.put(s1, 1);
		tmap.put(s2, 2);
		tmap.put(s3, 3);
		tmap.put(s4, 4);
		
		System.out.println(tmap);
	}
}
