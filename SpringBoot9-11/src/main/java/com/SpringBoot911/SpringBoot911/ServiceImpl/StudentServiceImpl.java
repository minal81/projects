package com.SpringBoot911.SpringBoot911.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot911.SpringBoot911.Exception.StudentException;
import com.SpringBoot911.SpringBoot911.Service.StudentService;
import com.SpringBoot911.SpringBoot911.entity.Student;
import com.SpringBoot911.SpringBoot911.respository.StudentRepository;


@Service
public class StudentServiceImpl  implements StudentService {
	@Autowired
	StudentRepository studentepository;

	@Override
	public Student saveS(Student student) {
		
		return studentepository.save(student);
	}

	@Override
	public Student GetSId(int id) {
		
		return studentepository.findById(id).orElseThrow(() -> new StudentException("incorrect Student Details"));
	}

	@Override
	public Student UpdateSId(Student student, int id) {
		Student es=studentepository.findById(id).orElseThrow(() -> new StudentException("incorrect Student Details"));
		//es.setEmail(student.getEmail());
		es.setBatches(student.getBatches());
		studentepository.save(es);
		return es;
	}

	@Override
	public List<Student> GetAll() {
		// TODO Auto-generated method stub
		return studentepository.findAll();
	}
	@Override
	public void DeleteSId(int id) {
		studentepository.findById(id).orElseThrow(() -> new StudentException("incorrect Student Details"));
		studentepository.deleteById(id);
		
		
		
	}

	@Override
	public List<Student> GetSName(String name) {
		
		return studentepository.GetSName(name);
	}

}
