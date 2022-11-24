package com.EmployeeJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {
	  
	     
	    public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
	        Employee emp=new Employee();  
	        emp.setId(rs.getInt(1));  
	        emp.setName(rs.getString(2));  
	        emp.setSalary(rs.getString(3));  
	        return emp;  
	    }  

}
