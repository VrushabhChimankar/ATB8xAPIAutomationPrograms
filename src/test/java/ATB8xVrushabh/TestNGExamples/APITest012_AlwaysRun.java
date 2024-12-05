package ATB8xVrushabh.TestNGExamples;

import org.testng.annotations.Test;

public class APITest012_AlwaysRun {

    @Test
    public  void Test1(){

        System.out.println("This is test 1");
    }
    @Test(alwaysRun = true )
    public  void Test2(){

        System.out.println("This is test 2");
    }
    @Test
    public  void Test3(){

        System.out.println("This is test 3");
    }




}
