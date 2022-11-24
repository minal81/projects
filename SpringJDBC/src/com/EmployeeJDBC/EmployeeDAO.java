package com.EmployeeJDBC;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDAO {
	private JdbcTemplate jdbctemp;

	

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	public int saveEmployee(Employee e)
	{
		
		String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		return jdbctemp.update(query);
		
	}
	
	public int updateEmployee(Employee e)
	{
		
		String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"'";
		return jdbctemp.update(query);
		
	}
	public int DeleteEmployee(Employee e)
	{
		
		String query="delete from employee where id='"+e.getId()+"'";
		return jdbctemp.update(query);
		
	}
	public List<Employee> viewEmployee()
	{
		String query1="select *from Employee";
		List<Employee> emp=jdbctemp.query(query1, new EmployeeMapper());
		return emp;
	}
	
	

}
