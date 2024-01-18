
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.edge.EdgeDriver;
public class tut_assertion {

    public WebDriver driver;

    @Test

    public void browser() throws InterruptedException {

            System.setProperty("webdriver.edge.driver", "C:\\Users\\1925566\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://10.11.144.178:8107/home/login/1/");
            driver.manage().deleteAllCookies();


        }

    }