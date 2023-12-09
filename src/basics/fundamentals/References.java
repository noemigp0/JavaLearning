package basics.fundamentals;

public class References {
    public static void main (String args[]){

        /*x isn´t actually storing an array, is storing a reference just like [I@4dd8dc3
        * and this odd number would be the address of the array*/

        int[] x = {3, 22, 4, 16, 8};
        int[] y = x; //x has been assigned to y, but this isn´t actually storing the x array by itself is storing and pointing to the same reference as the x array


        System.out.println(x);
        System.out.println(y);
        System.out.println(y[0]);
        System.out.println(x[0]);
        y[0] = 20; //This line will modify x and y because both are pointing to the same reference which means the same array
        System.out.println(y[0]);
        System.out.println(x[0]);
    }
}
