package testng;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class parameterTest {
	protected WebDriver driver  ;
  @Test
  public void f(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Lauching Browser");
	
  }
}
