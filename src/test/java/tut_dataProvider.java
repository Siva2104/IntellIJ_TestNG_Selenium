

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

public class tut_dataProvider {
  private static final boolean True = false;
protected WebDriver driver;

  
	
	@BeforeMethod(alwaysRun = True)
  public void beforeMethod() throws InterruptedException   {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/"); Thread.sleep(50000);

  }
	@DataProvider(name="Login_details")
	  public Object[][] getDataFromDataprovider(){
	 
	  	{
	         Object [][] data  = new Object [2][2];
	         data[0][0] = "Admin";
	         data [0][1] = " admin123";
	         return data;
	      }

	  }
	@Test(dataProvider = "Login_details")
	  public void login(String username, String password) throws InterruptedException {
		
		By name = By.name("username");
		By passrd = By.name("password");
		By login_btn = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
		
		driver.findElement(name).sendKeys(username);
		driver.findElement(passrd).sendKeys(password);Thread.sleep(3000);
		driver.findElement(login_btn).click();
		Thread.sleep(3000);
			
	  }



}
