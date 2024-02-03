package leetCode;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {

    public  static void main(String args[]){

        //int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};

      isValid("()[]{}");



    }

    public static boolean isValid(String s){

        Stack<Character> characterStack = new Stack<>();
        boolean flag = false;

        for(int i = 0; i < s.length() ; i++){
            if( s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                characterStack.push(s.charAt(i));

            }

            if( s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
               if (characterStack.isEmpty()) return false;

               if (!(characterStack.pop() == '(' && s.charAt(i) == ')')) return false;
               if (!(characterStack.pop() == '[' && s.charAt(i) == ']')) return false;
               if (!(characterStack.pop() == '{' && s.charAt(i) == '}')) return false;

            }


        }


       // characterStack.forEach(System.out::println);
        //System.out.print(characterStack.peek());
        //characterStack.elements();
        //characterStack..get();


      return true;





    }
}
