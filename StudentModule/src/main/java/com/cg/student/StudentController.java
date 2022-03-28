package com.cg.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	//Retrieves all the rows from Student record
	@GetMapping("/students")
	public List<Student> listAll(){
		return service.listAll();
	}
	
	//Retrieves specific row from the record
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> get(@PathVariable Integer id){
		Student student=service.get(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}
	
	//Insert a row in database
	@PostMapping("/students")
	public void add(@RequestBody Student student) {
		service.save(student);
	}
	
	//update a row in database
		@PutMapping("/students/{id}")
		public ResponseEntity<?> update(@RequestBody Student student,@PathVariable Integer id){
			try {
				Student existstudent = service.get(id);
				service.save(student);
				return new ResponseEntity<Student>(student,HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		//Delete a row from database
		@DeleteMapping("/students/{id}")
		public void delete(@PathVariable Integer id) {
			service.delete(id);
		}
}
