package basics.handson;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallenge5 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        CodingChallenge5 codingChallenge5 = new CodingChallenge5();
        codingChallenge5.skippingIteration();
        //codingChallenge5.checkingPassword();
        //codingChallenge5.printingNumbers();
        //codingChallenge5.guessingNumberGame();

    }

    public void printingNumbers() {
        //Write a program which prints numbers from 89 to 117.
        for (int i = 89; i <= 117; i++) {
            System.out.println(i);
        }
        System.out.println("Next loop");
        for (int i = 0; i <= 10; i++){
                System.out.print(i + ",");
        }
        System.out.println("\b");
    }

    //Write a program which prints numbers from 1 to 40. After every third number, print “Quack.”.

    public void skippingIteration() {

        for (int i = 1; i <= 40; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("Quack");
            }            // 1 2 3, 4 5 6, 7 8 9

        }


    }

    public void checkingPassword() {
        /*
        Write a program which asks the user for a password. Make the password “shark50”.
        Each time the user enters the password incorrectly, prompt them for a password again.
        When the user enters the password correctly, print “ACCESS APPROVED”.
        * */

        String password = "shark50";

        /*do {
            System.out.println("Type your password: ");
            userPassword = scanner.next();

        } while(!password.equals(userPassword));
        System.out.println("ACCESS APPROVED");*/

        System.out.println("Type your password");
        String userPassword = scanner.next();

        while (!password.equals(userPassword)) {
            System.out.println("Incorrect password. Try again!");
            userPassword = scanner.next();
        }
        System.out.println("ACCESS APPROVED");

    }

    public void guessingNumberGame(){
        /*
        Create a game where the program picks a random number from 1 to 100 and the player has to guess it.
        Each time the player makes a guess, print “HIGHER” if the guess was too low or “LOWER” if the guess was too high.
        If the player correctly guesses the number, print “CORRECT”, then end the game.
        You can use the line of code below which produces a random number from 1 to 100, and stores it in randomNumber.
        * */

        /*
        * Modify the program in Exercise 5 so that once the game is won, it informs the player how many guesses it took them.*/
        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);

        System.out.println("I´m thinking of a number from 1 to 100. Try to guess it");
        System.out.println("randomNumber: " +randomNumber);
        int inputNumber = scanner.nextInt();
        int counter = 0;

        while(randomNumber != inputNumber) {
            if(randomNumber > inputNumber){
                System.out.println("LOWER");
            } else {
                System.out.println("HIGHER");
            }
            inputNumber = scanner.nextInt();
            counter++;

        }
        System.out.println("Correct! You tried " + counter + " times");

    }



}
