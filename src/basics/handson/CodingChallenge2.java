package basics.handson;

import java.util.Scanner;

public class CodingChallenge2 {
    public static void main(String args[]){

    CodingChallenge2 codingChallenge2 = new CodingChallenge2();
        //codingChallenge2.firstExercise();
        codingChallenge2.secondExercise();

    }


    public  void firstExercise(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.format("You have £%.2f on you and need £%.2f.\n", money, moneyNeeded);
        System.out.format("You’ve lived %d years. In another %d years you’ll be %d years old.”, where %d is their age.\n", age, 5 , age + 5, age);
        System.out.format("Your name has %d characters", firstName.length());

    }

    public void secondExercise(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bill total: ");
        Double billTotal = scanner.nextDouble();

        System.out.print("How many people: ");
        Integer peopleNumber = scanner.nextInt();

        System.out.format("Each person should pay: %.2f ", billTotal/peopleNumber);

    }
}
