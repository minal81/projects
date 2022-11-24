package com.SpringBoot911.SpringBoot911.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringBoot911.SpringBoot911.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>
{


//Custom Query
	@Query(" select s from Student s where s.name= ?1 ")
	List<Student> GetSName(String name);
}
