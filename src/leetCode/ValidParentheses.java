package leetCode;

import java.util.Arrays;

public class ValidParentheses {

    public  static void main(String args[]){

        //int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};

       isValid("()[]{}");



    }

    public static boolean isValid(String s){

       StringBuilder sb = new StringBuilder();
       sb.append(s.toString());

       int n = sb.length();
       int index = 0;

       while(index < n){

           System.out.println(sb.charAt(index));

           index += 2;

       }



        return false;
    }
}
