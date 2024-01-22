

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;



@SuppressWarnings("unused")
public class tut_FindBy {
	
	protected WebDriver driver  ;
		
	@Parameters({"url","username","password"})
	
  @BeforeTest
  public void beforeMethod(String url, String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Lauching Browser");		Thread.sleep(3000);
		

		//Locator
		By login = By.id("eud");
		By Password = By.id("epd");
		By login_btn = By.id("login");
		
		//Actions
		
		  driver.findElement(login).sendKeys(username);
		  driver.findElement(Password).sendKeys(password);
		  WebElement login_bt = driver.findElement(login_btn);
		  login_bt.click();
		
		
		
		//		driver.findElement(By.id("eud")).sendKeys(String.valueOf(username)); 	Thread.sleep(3000);
//			driver.findElement(By.id("epd")).sendKeys(password);	Thread.sleep(3000);
//			driver.findElement(By.id("login")).click();	
  }
	
	@AfterTest()
	public void browser() {
		driver.quit();
	}
	

}
	