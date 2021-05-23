package com.tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import com.code.Code;

public class Tests {
	
	Code code = new Code();
	private WebDriver driver;

	@BeforeTest
	public void Before() {
		if(code.Suma(4, 56) == 60) {
			System.out.println("Start Test =  OK");
		}else {
			System.out.println("Failed Test ");
		}
	}
	
	@Test
	public void Test01() throws InterruptedException {
		String URL = "https://www.google.com/";
		String Browser = "Chrome";
		assertEquals(5, code.Suma(2, 3));
		System.out.println("Test01 is OK !!!");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("Navegador: " + Browser);
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void Test02() {
		assertEquals(1, code.Resta(4, 3));
		System.out.println("Test02 is OK !!!");
	}
	
	@Test
	public void Test03() {
		assertEquals(25, code.Multiplicacion(5, 5));
		System.out.println("Test03 is OK !!!");
	}
	
	@Test
	public void Test04() {
		assertEquals(9, code.Division(81, 9));
		System.out.println("Test04 is OK !!!");
	}
	
	@Test
	public void Test05() {
		assertEquals(11, code.Suma(7, 4));
		System.out.println("Test05 is OK !!!");
	}
	
	@Test
	public void Test06() {
		System.out.println("Test06 is OK !!!");
	}
	
	@Test
	public void Test07() {
		System.out.println("Test07 is OK !!!");
	}
	
	@Test
	public void Test08() {
		System.out.println("Test08 is OK !!!");
	}
	
	@AfterTest
	public void After() {
		System.out.println("End Test   =  OK\n");
	}
}