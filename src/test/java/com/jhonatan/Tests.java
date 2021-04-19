package com.jhonatan;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Tests {
	
	int T = 0;
	Code util = new Code();
	
	@Before
	public void Before() {
		T = util.contador(T);
		System.out.println("Start Test " + T);
	}
	
	@Test
	public void Test01() {
		assertEquals(5, util.Suma(2, 3));
	}
	
	@Test
	public void Test02() {
		assertEquals(5, util.Suma(2, 3));
	}
	
	@Test
	public void Test03() {
		assertEquals(5, util.Suma(2, 3));
	}
	
	@Test
	public void Test04() {
		assertEquals(5, util.Suma(2, 3));
	}
	
	@Test
	public void Test05() {
		assertEquals(5, util.Suma(2, 3));
	}
	
	@After
	public void After() {
		System.out.println("End Test " + T);
	}
	
}
