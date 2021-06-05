
public class NumberSwapping {

    public void swappingOfNumbers(int x, int y) {
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println(x);
        System.out.println(y);
    }

    public void swappingOfNumbersUsingMultipleOperator(int x,int y) {
        x = x * y;
        y = x / y;
        x = x / y;
        System.out.println(x);
        System.out.println(y);
    }

    public void swappingNumberUsingXOR(int x, int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x);
        System.out.println(y);
    }

    public void swappingNumberUsingThirdVariable(int x, int y) {
        int z = x;
        x = y;
        y = z;
        System.out.println(x);
        System.out.println(y);
    }
}
