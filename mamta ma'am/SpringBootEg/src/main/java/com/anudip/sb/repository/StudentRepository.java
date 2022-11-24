package com.anudip.sb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anudip.sb.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	//custom query --jpql java persistence query lang
	
	@Query("select stu from Student stu where stu.name = ?1")
	List<Student> getSName(String name);
	
	@Query("select stu from Student stu where stu.status = ?1")
	List<Student> getSStatus(String status);
}
