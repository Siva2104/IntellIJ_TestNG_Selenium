import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tut_parameter {

	
	WebDriver driver ;
	@Parameters({"browser"})
  @Test
  public void Launch(String browser) {
    System.out.println("Running Browser is :" + browser);
	  
    
    if (browser.equals("chrome")){
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	driver = new ChromeDriver();
    	 	
    }
    else if (browser.equals("edge")) {
    	  System.setProperty("webdriver.edge.driver", "C:\\Users\\1925566\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    	driver = new EdgeDriver();
    }
    else if (browser.equals("Firefox")) {
    	driver = new FirefoxDriver();
    	System.out.println("Firefox");
  }
    
  }

}
