package BrowserAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyInfo {

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
				
				//MyInfo Tab Selection 
				driver.findElement(By.id("menu_pim_viewMyDetails")).click();
				driver.findElement(By.id("empPic")).click();
				driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\user\\Desktop\\APJ\\Images\\IMG_20180419_133308-01.jpeg");
				driver.findElement(By.id("btnSave")).click();
				
				
	}

}
