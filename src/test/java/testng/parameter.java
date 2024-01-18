package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter {

	
	 WebDriver driver ;

  @Test
  @Parameters("url")
  
  
  public void Launch(String url) {
		
	try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		}
  
  catch (Exception e){
	   
	  e.printStackTrace();
  }
  
 
}
}
