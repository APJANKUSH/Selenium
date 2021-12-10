package BrowserAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\APJ\\Selenium\\Drivers-or-jar\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		//Login Script
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		//Leave List Tab
	    driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	    driver.findElement(By.id("leaveList_chkSearchFilter_-1")).click();

		//leave selection 
	    Select leave = new Select(driver.findElement(By.id("select_leave_action_69")));
	    leave.selectByVisibleText("Cancel");
		
		// profile page set up script
	    driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.id("aboutDisplayLink")).click();
	    driver.findElement(By.className("close")).click();
	    
	}

}
