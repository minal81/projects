package com.anudip.sb.controller;

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
import com.anudip.sb.entity.Student;
import com.anudip.sb.service.StudentService;

// link all the rest api endpoints
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student){
		return  new ResponseEntity<Student>(studentservice.saveS(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getStudent(){
		return studentservice.getS();
	}
	
	@GetMapping("/getStudentId/{id}")
	public ResponseEntity<Student> getStudentId(@PathVariable int id){
		return new ResponseEntity<Student>(studentservice.getSid(id), HttpStatus.OK);
	}

	@PutMapping("/updateStudentId/{id}")
	public ResponseEntity<Student> updateStudentId(@PathVariable int id, @RequestBody Student student){
		return new ResponseEntity<Student>(studentservice.updateSid(student, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStudentId/{id}")
	public ResponseEntity<String> deleteStudentId(@PathVariable int id){
			studentservice.deleteSid(id);
			return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);

	}
	
	@GetMapping("/getStudentname/{name}")
	public List<Student> getStudentName(@PathVariable String name){
		return studentservice.getSName(name);
	}
	
	@GetMapping("/getStudentstatus/{status}")
	public List<Student> getStudentStatus(@PathVariable String status){
		return studentservice.getSStatus(status);
	}
}
