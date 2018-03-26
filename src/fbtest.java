import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class fbtest {
    static WebDriver driver;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	     System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	     driver= new FirefoxDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		driver.get("http://www.facebook.com");
	     driver.manage().window().maximize();

	     driver.findElement(By.id("email")).sendKeys("ahlamkharrousheh@hotmail.com");
	     driver.findElement(By.id("pass")).sendKeys("ah");
	     driver.findElement(By.id("u_0_2")).click();
	     
		
		
	}

}
