import org.testng.annotations.*;

public class tut_grouping {
@Test(groups = "Sanity")
    void test_1()
{
        System.out.println("Test_1");
    }
    @Test(groups = "regression")
    void test_2()
    {
        System.out.println("test_2");
    }
    @Test(groups = "Sanity")
    void test_3()
    {
        System.out.println("test_3");
    }
    @Test(groups = "regression")
    void test_4()
    {
        System.out.println("test_4");
    }@Test(groups = {"Sanity","regression"})
    void test_5()
    {
        System.out.println("test_5");
    }@Test(groups = "Sanity")
    void test_6()
    {
        System.out.println("test_6");
    }


}
