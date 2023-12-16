package basics.handson.fundamentals.endodsection;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallenge4 {
    /*
    * If you have not already done so, modify Exercise 3 so the program guesses your number in the least amount of steps.
    Hint: Think about playing against a friend.
    * How would you narrow it down to their number as quickly and efficiently as possible? You may not need to generate a random number at all.
    *
    * */


        public static void main(String args[]) {
            System.out.println("Think about a number from 1 and 100.");

            Scanner scanner = new Scanner(System.in);
            String input = "";



            int min = 1;
            int max = 100;
            int guess = 50;


            while (!input.equals("correct")) {
                System.out.println("Type \"higher\" if my answer is too low,\"lower\" if my answer is to high or \"correct\" if I´m right");
                System.out.println("Your number is: " + guess);
                input = scanner.next();
                switch (input) {
                    case "higher":
                        //int lowerNumber = ThreadLocalRandom.current().nextInt(1, randomNumber);
                        max = guess  + 1; // udemy solution

                        break;
                    case "lower":
                        //int higherNumber = ThreadLocalRandom.current().nextInt(randomNumber, 100); // my solution
                        min = guess - 1; //udemy solution

                        break;
                    default:
                        System.out.println("Response not recognized");
                        break;

                }
                guess = (min + max) / 2;


            }
        }
    }





