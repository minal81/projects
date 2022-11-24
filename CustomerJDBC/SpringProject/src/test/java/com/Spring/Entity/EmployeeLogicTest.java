package com.Spring.Entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeLogicTest {

	@Test
	public void testViewEmployees() {
		EmployeeLogic E1=new EmployeeLogic();
		assertEquals(true,E1.viewAll());
		//fail("Not yet implemented");
	}

	@Test
	public void testUpdateEmployeesName() {
		EmployeeLogic E1=new EmployeeLogic();
		assertEquals(true,E1.updateEmployeesName());
		//fail("Not yet implemented");
		//fail("Not yet implemented");
	}

}
