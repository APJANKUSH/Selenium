package BrowserAccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\APJ\\Selenium\\Drivers-or-jar\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		DesiredCapabilities dca=new DesiredCapabilities();
		dca.setAcceptInsecureCerts(true);
		driver.get("https:\\www.google.com");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		
	}

}
