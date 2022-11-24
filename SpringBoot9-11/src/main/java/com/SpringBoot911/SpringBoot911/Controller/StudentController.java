package com.SpringBoot911.SpringBoot911.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot911.SpringBoot911.Service.StudentService;
import com.SpringBoot911.SpringBoot911.entity.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/StudentSave")
	public ResponseEntity<Student> saveS(@Valid @RequestBody Student student)
	{
		return new ResponseEntity<Student> (studentservice.saveS(student) , HttpStatus.CREATED);
		
	}
	@GetMapping("/StudentGetAll")
	public List<Student> getStudent()
	{
		return studentservice.GetAll();
	}
	
	
	@GetMapping("/StudentGetById/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id)
	{
		return new ResponseEntity<Student> (studentservice.GetSId(id) , HttpStatus.OK);
		
	}
	 
	@PutMapping("/StudentUpdate/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student ,@PathVariable int id)
	{
		return new ResponseEntity<Student> (studentservice.UpdateSId(student,id),HttpStatus.OK);
	}
	@DeleteMapping("/Studentdelete/{id}")
	public  void deleteStudent(@PathVariable int id)
	{
		 studentservice.DeleteSId(id);
		System.out.println("Deleted");
	}
	@GetMapping("/StudentGetName/{name}")
	public List<Student> getSName(@RequestBody Student student ,@PathVariable String name)
	{
		return studentservice.GetSName(name);
	}
	
	

}
