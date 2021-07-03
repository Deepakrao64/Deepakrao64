package TestNG.Groups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassThree {

    @Test(groups ={"Group2"})
    public void test3(){
        System.out.println("Inside class three");
    }

    @Test(dependsOnMethods = {"test3"})
    public void dependedTest(){
        System.out.println("Inside dependent test");
    }
}
