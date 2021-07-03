package TestNG.Groups.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {
    @DataProvider(name = "rollNoAndName")
    public Object[][] getData(){
        return new Object[][] {
                {"1","Deepak", "IT"}, {"2","Ravi","IT"}
        };
    }

    @Test(dataProvider = "rollNoAndName")
    public void dpTest(String first, String sec, String third){
        System.out.println("Roll number is "+first+"  Student Name is "+sec +" "+third);
    }
}
