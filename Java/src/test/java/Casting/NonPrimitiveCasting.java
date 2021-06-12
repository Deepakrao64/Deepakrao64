package Casting;

public class NonPrimitiveCasting extends ParentClass {
    public void printName1(){
        System.out.println("Ravi");
    }

    public static void main(String[] args) {
        //Upcasting
        ParentClass n = new NonPrimitiveCasting();
        n.printName();

        //DownCasting
        ParentClass p = new ParentClass();
        NonPrimitiveCasting cast = (NonPrimitiveCasting)p;
        cast.printName1();
    }
}

class ParentClass {
    public void printName(){
        System.out.println("Deepak");
    }

}
