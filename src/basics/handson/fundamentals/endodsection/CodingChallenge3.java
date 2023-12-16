package basics.handson.fundamentals.endodsection;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallenge3 {
    /*  solutions ---> https://www.udemy.com/course/java-for-absolute-beginners/learn/lecture/9185268#questions
    * Back in “Coding Challenge 4 - Loops”, for Exercise 5, you were tasked to write a guess-my-number game.
    * The program picked a random number from 1 and 100 and you had to guess it.
    * This time, reverse the roles. Think of a number from 1 to 100 and write a program which tries to guess it.
    * Type “higher” if the program guesses too low, or “lower” if the program guesses too high.
    * Have the program make subsequent guesses based on this information.
    * When the program guesses your number type “correct” and end the program.
    Hint: Remember, if you need it, you can use the following line of code to generate a random number:
    *   int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

    * */

    public static void main(String args[]) {
        System.out.println("Think about a number from 1 and 100.");

        Scanner scanner = new Scanner(System.in);
        String input = null;


        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("Your number is: " + randomNumber);
        System.out.println("Type \"higher\" if my answer is too low,\"lower\" if my answer is to high or \"correct\" if I´m right");
        input = scanner.next();

        while (!input.equals("correct")) {

            switch (input) {
                case "higher":
                    //int lowerNumber = ThreadLocalRandom.current().nextInt(1, randomNumber);
                    randomNumber = randomNumber -1; // udemy solution
                    System.out.println("Your number is: " + randomNumber);
                    System.out.println("Type \"higher\" if my answer is too low,\"lower\" if my answer is to high or \"correct\" if I´m right");
                    input = scanner.next();
                    break;
                case "lower":
                    //int higherNumber = ThreadLocalRandom.current().nextInt(randomNumber, 100); // my solution
                    randomNumber = randomNumber +1; //udemy solution
                    System.out.println("Your number is: " + randomNumber);
                    System.out.println("Type \"higher\" if my answer is too low,\"lower\" if my answer is to high or \"correct\" if I´m right");
                    input = scanner.next();
                   break;
                default:
                    System.out.println("Response not recognized");
                    break;

            }


        }
    }
}
