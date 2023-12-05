package basics.fundamentals;

import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);//creating and object to use scanner
        String input = scanner.next();//next returns a string
        System.out.println(input);
    }
}
