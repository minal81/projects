package com.anudip.sb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.sb.entity.Student;
import com.anudip.sb.exception.StudentNotFoundException;
import com.anudip.sb.repository.StudentRepository;
import com.anudip.sb.service.StudentService;

//implementing business logic all Service method -- CRUD method
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository srepo;

	@Override
	public Student saveS(Student student) {
	
		return srepo.save(student);
	}

	@Override
	public Student getSid(int id) {
		
		return srepo.findById(id).orElseThrow(() -> new StudentNotFoundException("incorrect student details"));
	}

	@Override
	public List<Student> getS() {
	
		return srepo.findAll();
	}

	@Override
	public Student updateSid(Student student, int id) {
	Student es =  srepo.findById(id).orElseThrow(() -> new StudentNotFoundException("incorrect student details"));
	
	//set your new email
	es.setEmail(student.getEmail());
	
	//save new student object
	srepo.save(es);
		return es;
	}

	@Override
	public void deleteSid(int id) {
		 srepo.findById(id).orElseThrow(() -> new StudentNotFoundException("incorrect student details"));
		srepo.deleteById(id);
	}

	@Override
	public List<Student> getSName(String name) {
		
		return srepo.getSName(name);
	}

	@Override
	public List<Student> getSStatus(String status) {
		
		return srepo.getSStatus(status);
	}

}
