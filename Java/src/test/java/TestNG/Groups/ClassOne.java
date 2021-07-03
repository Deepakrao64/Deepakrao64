package TestNG.Groups;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassOne {

//    @Test(groups ={"Group1"})
    public static int test1(){
        System.out.println("Inside class one");
        try {
           int i= 5/0;
        } catch (ArithmeticException e) {
            return 30;
        } finally {
            System.out.println("inside finally");
        }
        return 0;
    }

    @Test()
    public void x(){
        System.out.println(test1());
    }

}
