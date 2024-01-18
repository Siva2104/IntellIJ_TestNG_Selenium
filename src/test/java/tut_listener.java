
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

//ItestListener
@SuppressWarnings("unused")
 public class tut_listener implements ITestListener  {


	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		 System.out.println("onStart");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("onTestFailedWithTimeout");
	}

	public void onTestFailure(ITestResult result) {
		 System.out.println("onTestFailure");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("onTestSkipped");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("onTestSuccess");
	}
    

	
	
	

}
