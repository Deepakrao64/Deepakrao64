import org.testng.annotations.Test;

public class IntegerReverse {

    /** Code for reversing integer with mathematical approach */
    public void reverseInteger(int num){
        int rev = 0;
        while (num!=0){
            rev = rev * 10 + num%10;
            num = num/10;
        }
        System.out.println("Reversed number is :: "+rev);
    }

    /** Code for reversing integer with String Buffer */
    public void reverseIntegerUsingStringBuffer(int num){
        System.out.println(new StringBuffer(String.valueOf(num)).reverse());
    }
}
