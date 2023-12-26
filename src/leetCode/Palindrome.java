package leetCode;

public class Palindrome {
    public static void main(String args[]){

        int x = -121;
        boolean isPalindrome = isPalindrome(x);
        System.out.println( x + " " + isPalindrome);
    }

    static boolean isPalindrome(int x){

        String stringNumber = String.valueOf(x);
        int j = stringNumber.length() -1;
        int counter = 0;

        while( counter < stringNumber.length() ){
            if(stringNumber.charAt(counter) != stringNumber.charAt(j)){
                   return false;
            }

            counter++;
            j--;
        }


        return true;
    }
}
