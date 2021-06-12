package Casting;

public class PrimitiveCasting {
    public static void main(String[] args) {

        // Primitive casting
        // 1. Implicit casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        // 2. Explicit casting
        double myDoubleNum = 9.5;
        int myIntNum = (int) myDoubleNum;
        System.out.println(myDoubleNum);
        System.out.println(myIntNum);
    }

}
