package BrowserAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Browser {
	
	public static void main(String[] apj) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\APJ\\Selenium\\Drivers-or-jar\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Browser Script
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		driver.get("https:\\www.google.com");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		//Login Script
		Thread.sleep(1000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).click();
		
		//Dashboard Script - Admin Panel
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Ankush");
		Thread.sleep(1000);
		driver.findElement(By.className("searchbutton")).click();
		
	     driver.findElement(By.id("btnAdd")).click();
	     
		
		// Adding new User
		
	    // User Role
		Select dp=new Select(driver.findElement(By.id("systemUser_userType")));
		dp.selectByVisibleText("ESS");
		Thread.sleep(1000);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("adash");
		Thread.sleep(1000);
		driver.findElement(By.id("systemUser_userName")).sendKeys("apjtech");
		Thread.sleep(1000);
		
		Select dp1=new Select(driver.findElement(By.id("systemUser_status")));
		dp1.selectByVisibleText("Enabled");
		Thread.sleep(1000);
		
		driver.findElement(By.id("systemUser_password")).sendKeys("Password@123");
		Thread.sleep(1000);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Password@123");
		Thread.sleep(1000);
		
		driver.findElement(By.id("btnSave")).click();
	
		
		
		
		//Dashboard Script - PIM Panel
	    driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis Adalwin");		
		driver.findElement(By.className("ac_even")).click();
		
		driver.findElement(By.id("empsearch_id")).sendKeys("0208");
		Select mydrop = new Select(driver.findElement(By.id("empsearch_employee_status")));
		
		mydrop.selectByVisibleText("Full time Probation");
		
		Select mydrop1 = new Select(driver.findElement(By.id("empsearch_termination")));
		mydrop1.selectByVisibleText("Current and Past Employees");
		
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("John Smith");
		
		Select mydrop2 = new Select(driver.findElement(By.id("empsearch_job_title")));
		 mydrop2.selectByVisibleText("Engineer");
		 
		
		Select mydrop3 = new Select(driver.findElement(By.id("empsearch_sub_unit")));
		mydrop3.selectByVisibleText("Development");
		
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(1000);
     	driver.close();
     	
     
		
	}

}
