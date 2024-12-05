package ATB8xVrushabh.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.*;

public class APITest008_TestNG {



    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before suite");
        Assert.assertTrue(true);
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before test");
        Assert.assertTrue(true);
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before class");
        Assert.assertTrue(true);
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before method");
        Assert.assertTrue(true);
    }

    @Test
    public void Test01(){
        System.out.println("Test Case 01");
        Assert.assertTrue(true);
    }


    @Test
    public void Test02(){
        Assert.assertTrue(true);
        System.out.println("Test Case 02");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("After method");
        Assert.assertTrue(true);
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("After Class");
        Assert.assertTrue(true);
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("After Test");
        Assert.assertTrue(true);
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("After suite");
        Assert.assertTrue(true);
    }




}
