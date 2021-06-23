package com.myapp.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.ControllerLinkRelationProvider;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.source.doctree.LinkTree;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(path = "/get/{id}")
	public @ResponseBody EntityModel<Student> getStudent(@PathVariable int id) throws Exception {
		Student student=studentService.getStudent(id);
		
		if(null==student)
			throw new Exception("Student Not Found");
		
		//HATEOAS
		EntityModel<Student> resource=EntityModel.of(student);
		resource.add(linkTo(methodOn(StudentController.class).getAll()).withRel("All-Students"));
		resource.add(linkTo(methodOn(StudentController.class).getAll()).withRel("All-Students"));
	
		return resource;
	}
	
	@PostMapping(value = "/create")
	public Student create(@Valid @RequestBody Student student) {
		return studentService.add(student);
	}
	
	@GetMapping("/getall")
	public List<Student> getAll() {
		return studentService.getStudentList();
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Student> remove(@PathVariable int id) throws Exception {
		System.out.println("id : "+id);
		return studentService.remove(id);
	}
	
}
