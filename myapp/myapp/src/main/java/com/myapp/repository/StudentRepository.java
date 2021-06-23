package com.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.controller.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
