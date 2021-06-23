package com.myapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	List<Student> studentList;
	boolean flag=false;
	
	public StudentService() {
		super();
		//studentList=new CopyOnWriteArrayList<>();
		studentList=new ArrayList<>(); //concurrent modification exception
		studentList.add(new Student(1, "Amol"));
		studentList.add(new Student(2, "Raj"));
		studentList.add(new Student(3, "Priya"));
		studentList.add(new Student(4, "Soham"));
		studentList.add(new Student(5, "Shubham"));
	}

	public List<Student> getStudentList() {
		return studentList;
	}
	
	public Student getStudent(int id) {
		return studentList.get(id-1);
	}

	public Student add(Student std) {
		 studentList.add(std);
		 return studentList.get(studentList.size()-1);
	}
	
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public List<Student> remove(int id) throws Exception {
		flag=false;
		
		/*
		 * for(Student student: studentList) { if(student.getId()==id) {
		 * studentList.remove(student); } }
		 */
		
		ListIterator<Student> iterator=studentList.listIterator();
		
		while(iterator.hasNext()) {
			Student student=iterator.next();
			if(student.getId()==id) {
				iterator.remove();
				flag=true;
			}
		}
		
		 if(!flag) {
			 throw new Exception("Student not present");
		 }
		 return studentList;
	}
	
}
