package basics.unit1_fundamentals;

import java.util.Scanner;

public class ScannerExercise {
    public static void main (String args[]){
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + " is a nice name");

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Your name is "+ name + " and your age is: "+ age + " years old");

        System.out.println("How tall are you in metrees");
        Double height = scanner.nextDouble();
        System.out.println("You are "+ height + " metres tall");

        Double femaleHeightAverage = 1.75;
        Double maleHeightAverage = 1.62;

        String message = "The difference between your height and the average is ";


        System.out.format("%s %.2f if you are a female\n", message, femaleHeightAverage);
        System.out.format("%s %.2f if you are a male",message, maleHeightAverage);






    }
}
