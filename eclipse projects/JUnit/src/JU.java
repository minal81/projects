import static org.junit.Assert.*;

import org.junit.Test;

public class JU {

	@Test
	public void testFindMax()
	{

		assertEquals(10,JUnitEx.FindMax(new int[] {1,3,10,2}));
		assertEquals(-1,JUnitEx.FindMax(new int[] {-1,-3,-4,-2,-5}));
	}

}
