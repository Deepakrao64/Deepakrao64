package TestNG.Groups;

import org.testng.annotations.Test;

public class ClassTwo {

    @Test(groups ={"Group1"})
    public void test2(){
        System.out.println("Inside class two");
    }
}
