
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tut_CorssBrowser {

	
	
	protected WebDriver driver ;

  @BeforeTest(alwaysRun = true)
	@Parameters({"browser","url", "openurl"})
  public void Launch(String browser, String url, String openurl) {
    System.out.println("Running Browser is :" + browser);
	  
    
    if (browser.equalsIgnoreCase("chrome")){
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get(url);
    	driver.manage().window().maximize();
    	
    	 	
    }
    else if (browser.equalsIgnoreCase("edge")) {
  	  System.setProperty("webdriver.edge.driver", "C:\\BFSI_test\\automation\\selenium_automation_Browsers\\edgedriver_win64\\msedgedriver.exe\\");
  	driver = new EdgeDriver();
  	driver.get(url);
  	driver.manage().window().maximize();
  	
  }
    else if (browser.equalsIgnoreCase("FireFox")) {
    	 System.setProperty("webdriver.edge.driver", "C:\\BFSI_test\\automation\\selenium_automation_Browsers\\geckodriver-v0.34.0-win64\\geckodriver.exe\\");
    	driver = new FirefoxDriver();
    	driver.get(url);
    	driver.manage().window().maximize();
    	
    }
  }

}
