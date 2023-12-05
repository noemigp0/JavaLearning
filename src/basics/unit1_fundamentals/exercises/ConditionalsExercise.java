package basics.unit1_fundamentals.exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ConditionalsExercise {

    public static void main(String args[]){

        ConditionalsExercise conditionalsExercise = new ConditionalsExercise();
        //conditionalsExercise.simpleComparisonNumbers();
        conditionalsExercise.randomNumberGame();
    }

    public void simpleComparisonNumbers(){

        int x = 8;
        int y = 13;

        if (x > y){
            System.out.println("x is bigger than y by: " + (x - y));
        }
        else if (x == y){
            System.out.println("x and y are the same");
        }
        else {
            System.out.println("x is smaller than y by: " + (y - x));
        }

    }

    public void randomNumberGame(){
        int randomNumber = ThreadLocalRandom.current().nextInt(1,6); //Remain a random number between
        System.out.println(randomNumber);


        System.out.println("I´m thinking of a number from 1 to 5. Try to guess it");
        System.out.println("Your guess: ");
        Scanner scanner = new Scanner(System.in);
        int guessNumber = scanner.nextInt();


        if (guessNumber == randomNumber){
            System.out.println("Correct! Aren´t you lucky");
        } else {
            System.out.println("Wrong! Have another go");
            System.out.println("Your guess");
            guessNumber = scanner.nextInt();
            if (guessNumber == randomNumber){
                System.out.println("Correct! About time");
            } else {
                System.out.println("Wrong again! Maybe next time");
            }
        }
    }

}
