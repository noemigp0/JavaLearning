package leetCode;

import java.util.Scanner;

public class Series {
    /*https://www.hackerrank.com/challenges/java-loops/problem
    * q = queries --> indicates the number of queries the program must ask the input
    *  a= 0 b = 2 n = 10
    *  0 + 2^0 * 2
    *  2
    * 2 + (2^1 * b) = 6
    * 6
    * 6 + (2^2 * b) = 6
    *  2 6 14
    * */

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            String serie = "";
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                a = (int) (a + ((Math.pow(2,j) * b)));
                serie += a + " ";

            }
            System.out.println(serie.substring(0,serie.length()-1));
        }
        in.close();








    }


}
