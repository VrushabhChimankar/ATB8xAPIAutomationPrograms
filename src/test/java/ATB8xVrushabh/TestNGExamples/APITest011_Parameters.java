package ATB8xVrushabh.TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITest011_Parameters {


    @Parameters("browser")
    @Test
    public void demo(String value){
        System.out.println("Browser is " + value);

        if (value.equalsIgnoreCase("chrome")){
            System.out.println("Start my chrome");
        }
        if (value.equalsIgnoreCase("firefox")){
            System.out.println("Start my firefox");
        }
    }


}
