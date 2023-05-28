package basics.unit1_fundamentals;

public class DataTypes {
    public static void main (String args[]){

        byte guitar = 127;
        System.out.println(guitar);

        /*In a division if both numbers are integers, the result will be assigned as integer
        **But if at least one  of the numbers has a decimal, the result will be assigned into a double
         */

        System.out.println(15.0 / 7);

        char a = 65;
        System.out.println("Unicode\t"+ a);
        char x='\u0041';

        System.out.print("hexadecimal\t" + x);
        char t='s';

    }
}
