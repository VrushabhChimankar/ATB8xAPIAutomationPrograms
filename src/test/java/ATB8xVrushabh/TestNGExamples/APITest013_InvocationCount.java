package ATB8xVrushabh.TestNGExamples;

import org.testng.annotations.Test;

public class APITest013_InvocationCount {

    @Test(invocationCount = 10)
    public void test01(){

        System.out.println("This is my test case 1");
    }
}
