package BrowserAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
				
				//New tab Selection 
				
				driver.findElement(By.id("menu_buzz_viewBuzz")).click();
				
				driver.findElement(By.id("status_icon")).click();
				
				driver.findElement(By.id("createPost_content")).sendKeys("Nothing is their in my mind");
				
				driver.findElement(By.id("postSubmitBtn")).click();
				
				
				
				
				
				
				//createPost_content
	}

}
