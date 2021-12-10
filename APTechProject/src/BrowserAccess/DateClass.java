package BrowserAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\APJ\\Selenium\\Drivers-or-jar\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Browser Script
		driver.get("https:\\www.google.com");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		//Login Script
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		//Date Picker 
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		
		
		Select datepick = new Select(driver.findElement(By.className("ui-datepicker-month")));
		datepick.selectByValue("11");
		System.out.println(datepick);
		Select datepick1 = new Select(driver.findElement(By.className("calFromDate")));
		datepick1.selectByValue("1998");
		
		Select datepick2 = new Select(driver.findElement(By.className("calFromDate")));
		datepick2.deselectByVisibleText("31");
		
	}

}
