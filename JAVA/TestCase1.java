package week3day6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import week3day4.Connection1;

public class TestCase1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(2,2);
		assertEquals(5,Connection1.calculate(2,3));
	}
	public void test1() {
		assertEquals("abc","ABC");
	}
	@After
	public void after() {
		System.out.println("In after");
	}
	@Before
	public void before() {
		System.out.println("In before");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("In after class");
	}
	@BeforeClass
	public static void main () {
		System.out.println("In before class");
	}
	
	
}
