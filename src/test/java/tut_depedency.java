import org.testng.annotations.*;
import org.testng.annotations.Test;


public class tut_depedency {
	


	private String parentWindowHandle;
	
    // test case 1
    @Test(priority = 1)
    public void testCase1() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        
        System.out.println("in test case 1");
    }
    @Test(priority = 3)
    public void testCase2() {
        System.out.println("in test case 2");
    }
    @Test(priority = 2)
    public void testCase3() {
        System.out.println("in test case 3");
    }
    /////change
	
}