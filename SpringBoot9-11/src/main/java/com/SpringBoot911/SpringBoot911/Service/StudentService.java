package com.SpringBoot911.SpringBoot911.Service;

import java.util.List;

//import org.springframework.http.ResponseEntity;

import com.SpringBoot911.SpringBoot911.entity.Student;

public interface StudentService {
	//insert Student data
Student saveS(Student student);
//fetch Student data
Student GetSId(int id);
//update Student data
Student UpdateSId(Student student,int id);
//get all student
List<Student> GetAll();
//delete Student data
void DeleteSId(int id);
//get student by it name
List<Student> GetSName(String name);

}
