package com.tests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import com.code.Code;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestNG_0001 {
	
	Code code = new Code();
	private WebDriver driver;
	
	@BeforeClass
//	@Parameters({"URL", "Browser"})
//	public void Before(String URL, String Browser) {
	public void BeforeClass() {
		String URL = "https://www.google.com/";
		String Browser = "Chrome";
		if(code.Suma(4, 56) == 60) {
			System.out.println("Start Test =  OK");
		}else {
			System.out.println("Failed Test ");
		}
		
		if(Browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if(Browser.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", "./src/test/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("Navegador: " + Browser);
	}
	
	@Test
	public void Test01() {
		assertEquals(5, code.Suma(2, 3));
		System.out.println("Test01 is OK !!!");
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
	
	@AfterClass
	public void AfterClass() throws InterruptedException {
		System.out.println("End Test   =  OK\n");
		Thread.sleep(2000);
		driver.quit();
	}
}