package com.Student;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentLogicTest2 {

	@Test
	public void testViewData() {
		StudentLogic Student=new StudentLogic();
		assertEquals(true,Student.DeleteData());
		//fail("Not yet implemented");
	}

}
