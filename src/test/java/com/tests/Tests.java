package com.tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.code.Code;

public class Tests {
	
	int T = 0;
	Code util = new Code();

	@Before
	public void Before() {
		if(util.Suma(4, 56) == 60) {
			System.out.println("Start Test =  OK");
		}else {
			System.out.println("Failed Test ");
		}
	}
	
	@Test
	public void Test01() {
		assertEquals(5, util.Suma(2, 3));
		System.out.println("Test01 is OK !!!");
	}
	
	@Test
	public void Test02() {
		assertEquals(1, util.Resta(4, 3));
		System.out.println("Test02 is OK !!!");
	}
	
	@Test
	public void Test03() {
		assertEquals(25, util.Multiplicacion(5, 5));
		System.out.println("Test03 is OK !!!");
	}
	
	@Test
	public void Test04() {
		assertEquals(9, util.Division(81, 9));
		System.out.println("Test04 is OK !!!");
	}
	
	@Test
	public void Test05() {
		assertEquals(11, util.Suma(7, 4));
		System.out.println("Test05 is OK !!!");
	}
	
	@After
	public void After() {
		System.out.println("End Test   =  OK\n");
	}
}