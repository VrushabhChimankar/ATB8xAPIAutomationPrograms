package ATB8xVrushabh.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest009_Groups {


    @Test(groups = {"Smoke", "qa"})

    public void Smokerun(){
        System.out.println("Smoke run");
        Assert.assertTrue(true);

    }

    @Test(groups = {"sanity", "qa"})
    public void Sanityrun(){
        System.out.println("Sanity run");
        Assert.assertTrue(true);

    }

    @Test(groups = {"dev", "stage", "qa"})
    public void Functional(){
        System.out.println("Functional run");
        Assert.assertTrue(true);

    }

    @Test(groups = {"reg", "qa", "prepod"})
    public void Regression(){
        System.out.println("Regression run");
        Assert.assertTrue(true);

    }


}
