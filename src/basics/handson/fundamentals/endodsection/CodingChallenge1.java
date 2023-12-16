package basics.handson.fundamentals.endodsection;

import java.util.Scanner;

public class CodingChallenge1 {
    /*You have been tasked with writing a program for a school which produces some statistics on students’ exam results.
    The users are teachers who will input each student’s score, and any other necessary data.
    Store the scores in an array. The program should output:
    Each student’s score and percentage for the exam
    The mean (average) score and percentage of the exam
    Hints:
    Have the program ask how many students took the exam, so it knows how many scores to process.
    The program will also need to know the maximum possible score that can be achieved.
    It will also need to ask the user to input each student’s score (you can refer to each student as a number,
     e.g. “Student 1”, “Student 2”, etc, rather than asking for names.)
     */

    public static void main (String args[]){
            Scanner scanner = new Scanner(System.in);


            System.out.println("How many students took the exam?: ");
            int input = scanner.nextInt();

            System.out.println("What is the maximum score allowed: ");
            int maximumScore = scanner.nextInt();

            double[] studentScores = new double[input];
            System.out.println("Type the scores");
            for(int i = 0; i < studentScores.length; i++){
                System.out.println("Student " + (i +1));
                double score = scanner.nextDouble();

                if( score <= maximumScore){
                    studentScores[i] = score;

                } else {
                    System.out.println("The maximum score allowed is " + maximumScore);
                }
            }

             getStatistics(studentScores, maximumScore);




    }


    static void getStatistics(double[] studentScores, int maximumScore){
        System.out.println("Student number | Score | Percentage |");
        double sum = 0;
        for (int i = 0; i < studentScores.length; i++){

            System.out.println("  Student " + (i + 1) + "    |  " + studentScores[i] + "  |    " +
                    ((studentScores[i] * 100) / maximumScore) + "%   |");
            sum += studentScores[i];


        }
        System.out.println("The mean for the exam was: " + (sum/ studentScores.length));

    }


}
