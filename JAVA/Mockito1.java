package week4day1;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class Mockito1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("In test method");
		List<String> mockList = mock(List.class);
		when (mockList.size()).thenReturn(5);
		assertTrue(mockList.size()==5);
		System.out.println("End of test method");
	}

}
