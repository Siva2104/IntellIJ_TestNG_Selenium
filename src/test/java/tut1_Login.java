
/*  setup login and close functionality */



import org.testng.annotations.*;

public class tut1_Login {
  @Test
  public void f() {

    System.out.println("Execution of the Code");
  }
  @BeforeClass
  public void BeforeClass() {
    System.out.println("before class ");
  }
  @AfterClass
  public void Afterclass() {
    System.out.println("After class ");
  }
  @BeforeMethod
  public void login() {
	  System.out.println("Login Browser");

  }

  @AfterMethod
  public void logout() {
    System.out.println("logout browser");
  }

}
