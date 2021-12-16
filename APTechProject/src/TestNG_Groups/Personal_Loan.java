package TestNG_Groups;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Personal_Loan {
	
	@Test(groups= {"SmokeTest"})  
	 public void WebLoginPersonalLoan()  
	 {  
	     System.out.println("Web Login Personal Loan");  
	 }  
	 @Test  
	 public void MobileLoginPersonalLoan()  
	 {  
	     System.out.println("Mobile Login Personal Loan");  
	 }  
	 @Test  
	 public void APILoginPersonalLoan()  
	 {  
	     System.out.println("API Login Personal Loan");  
	 }  
}
