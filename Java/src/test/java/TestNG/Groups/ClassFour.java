package TestNG.Groups;

import org.testng.annotations.Test;

public class ClassFour {
    @Test(groups ={"Group2"})
    public void test4(){
        System.out.println("Inside class 4");
    }
}
