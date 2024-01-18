import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	


public  class tut_Listerner implements ITestListener {
	@Test
	@Override
	public  void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		 System.out.println("onStart");
	}
@Test

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("onTestFailedWithTimeout");
	}
@Test

	public void onTestFailure(ITestResult result) {
		 System.out.println("onTestFailure");
	}
@Test

public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	 System.out.println("onTestSkipped");
}
@Test
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	 System.out.println("onTestStart");
}
@Test
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	 System.out.println("onTestSuccess");
}

}
