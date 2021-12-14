package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ItemBuy {

		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\APJ\\Selenium\\Drivers-or-jar\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Browser Script
		driver.get("https:\\www.google.com");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		
//		driver.findElement(By.className("fk-modal-visible")).click();
		//Flipkart Login Script
//		driver.findElement(By.className("_1_3w1N")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8668840881");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7259755840");
	    Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("1529@Mypassword");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
        
        driver.navigate().refresh();

	}

}
