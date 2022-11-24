package com.anudip.sb.service;

import java.util.List;
import com.anudip.sb.entity.Student;

//CRUD method for student entity
public interface StudentService {
	
	//saving all student details in db table
	Student saveS(Student student);
	
	//fetching student details from db table based on id
	Student getSid(int id);
	
	//fetching student details from db table
	List<Student> getS(); 
	
	//modifying student details from db table based on id
	Student updateSid(Student student, int id);
	
	//removing student details from db table based on id
	void deleteSid(int id);
	
	List<Student> getSName(String name);
	
	List<Student> getSStatus(String status);
}
