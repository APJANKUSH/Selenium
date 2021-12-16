package TestNG_Groups;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class MyTestNGClass {
  WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\APJ\\Selenium\\Drivers-or-jar\\Chrome\\chromedriver.exe");
	  String baseUrl = "https://www.google.com/";
	  System.out.println("Launching Google Chrome browser"); 
      driver = new ChromeDriver();
      driver.get(baseUrl);
      driver.manage().window().maximize();
      
	  
  }
  @BeforeMethod
  public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");

	  
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  Thread.sleep(5000);
	    driver.close();
		System.out.println("Finished Test On Chrome Browser");
  }

}
