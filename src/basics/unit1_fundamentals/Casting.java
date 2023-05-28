package basics.unit1_fundamentals;

public class Casting {
    public static void main(String args[]){
        //Implicit conversion
        int integerValue = 5;
        double doubleValue = integerValue;
        System.out.println(integerValue);
        System.out.println(doubleValue);

        //Explicit conversion
        double secondDoubleValue = 3.5;
        int doubleToIntValue = (int) secondDoubleValue;
        System.out.println(doubleToIntValue);

    }
}
