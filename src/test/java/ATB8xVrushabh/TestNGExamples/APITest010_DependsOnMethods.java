package ATB8xVrushabh.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest010_DependsOnMethods {


    @Test
    public void ServerStart(){

        System.out.println("Server started");
        Assert.assertTrue(true);

    }

    @Test(dependsOnMethods = "ServerStart")
    public void method(){
        System.out.println("Method 01");
        Assert.assertTrue(true);

    }
    @Test(dependsOnMethods = "ServerStart")
    public void ServerClose(){

        System.out.println("Server close");
        Assert.assertTrue(true);

    }

}
