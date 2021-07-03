package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotation {

    @Test
    @Parameters({"browser"})
    public void params(String browser){
        if (browser.equalsIgnoreCase("chrome"))
        System.out.println("browser is chrome");
        else if (browser.equalsIgnoreCase("firefox"))
            System.out.println("browser is firefox");

    }
}
