package basics.unit1_fundamentals;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE ROLLER COASTER");
        System.out.print("Please enter you height in centimeter: ");
        int height = scanner.nextInt();

        if (height < 130 || height > 210){
            System.out.println("Sorry you don´t meet the height requirements");
        } else {
            System.out.println("Height accepted. Go ahead");
        }




    }
}
