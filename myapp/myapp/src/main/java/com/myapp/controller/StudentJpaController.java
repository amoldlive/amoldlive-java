package com.myapp.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.repository.StudentRepository;

@RestController
public class StudentJpaController {
	
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping(path = "/jpa/get/{id}")
	public @ResponseBody EntityModel<Optional<Student>> getStudent(@PathVariable int id) throws Exception {
		Optional<Student> student=studentRepository.findById(id);
		
		if(!student.isPresent())
			throw new Exception("Student Not Found");
		
		//HATEOAS
		EntityModel<Optional<Student>> resource=EntityModel.of(student);
		resource.add(linkTo(methodOn(StudentJpaController.class).getAll()).withRel("All-Students"));
		resource.add(linkTo(methodOn(StudentJpaController.class).getAll()).withRel("All-Students"));
	
		return resource;
	}
	
	@PostMapping(value = "/jpa/create")
	public Student create(@Valid @RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@GetMapping("/jpa/getall")
	public List<Student> getAll() {
		//return studentService.getStudentList();
		return studentRepository.findAll();
	}
	
	@DeleteMapping("/jpa/delete/{id}")
	public List<Student> remove(@PathVariable int id) throws Exception {
		System.out.println("id : "+id);
		studentRepository.deleteById(id);
		return studentRepository.findAll();
	}
	
}
