package leetCode;

import java.util.Scanner;

public class Series {
    /*
    * q = queries --> indicates the number of queries the program must ask the input
    *  a= 5 b = 3 n = 5
    *  5 + 2^0 * 3
    *  8
    *  2 6 14
    * */

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int a=0,b=0,n =-1;
        int t = in.nextInt();
        for (int i = 0; i < t; i++ ){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();

        }
        int counter = 0;
        double acumulator = 0;

        while (n > counter){
            acumulator  = acumulator + (a + (Math.pow(2, counter))) * b;
            System.out.println(acumulator);
            counter++;
        }


    }


}
