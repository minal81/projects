package com.Student;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentLogicTest {

	@Test
	public void testDeleteData() {
		StudentLogic Student=new StudentLogic();
		assertEquals(true,Student.DeleteData());
		//fail("Not yet implemented");
	}

}
