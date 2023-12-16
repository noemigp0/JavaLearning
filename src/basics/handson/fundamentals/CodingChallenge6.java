package basics.handson.fundamentals;

import java.util.Scanner;

public class CodingChallenge6 {
    public static void main (String args[]){
        CodingChallenge6 codingChallenge6= new CodingChallenge6();
        //codingChallenge6.simpleArray();
        codingChallenge6.populatingArray();
        //codingChallenge6.averageArray();
        //codingChallenge6.simpleArrayValidation();
    }

    public void simpleArray(){
        int[] arbitraryArray = new int[10];
        arbitraryArray[0] = 1;
        arbitraryArray[1] = 2;
        arbitraryArray[2] = 3;
        arbitraryArray[3] = 4;
        arbitraryArray[4] = 5;
        arbitraryArray[5] = 6;
        arbitraryArray[6] = 7;
        arbitraryArray[7] = 8;
        arbitraryArray[8] = 9;
        arbitraryArray[9] = 10;

        for (int index: arbitraryArray
        ) {
            System.out.println(index);
        }
    }

    public void populatingArray(){

        /*
        *Use a loop to populate an array with integers from 1 to 20.
        * Use another loop to print the contents of the array (the elements) backwards.
        * */

        int[] baseArray = new int[20];

       //int counter = 1;//I don´t need a counter because I already have a counter in i
        for(int i = 0; i < baseArray.length; i++){
            baseArray[i] = i+1;
        }

        for (int index: baseArray){
            System.out.println(index);
        }
    }


    public void averageArray(){
        /*
        *Create an array of five doubles and give each element some value.
        * Calculate the sum of all the elements and print the result.
        * Calculate the mean/average of the all the elements and print that too.
        * */

        double[] justADoubleArray = new double[5];
        justADoubleArray[0] = 1.1;
        justADoubleArray[1] = 1.2;
        justADoubleArray[2] = 1.3;
        justADoubleArray[3] = 2.4;
        justADoubleArray[4] = 2.4;

        double accumulator = 0;

        for(int i = 0; i < justADoubleArray.length; i++){
            accumulator += justADoubleArray[i];

        }
        System.out.println("The sum of all elements is: " + accumulator);
        System.out.println("The average of all elements is: " + accumulator/ justADoubleArray.length);
    }


    public void simpleArrayValidation(){
        /*
        *Write a program which asks the user to enter their top five favourite foods and store their answers in a string array.
        * However, create the array so, it can only hold a maximum of three strings.
        * After the user enters the third item, print “No more memory available.”
        * then print out the contents of the array.
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your top five foods: ");
        String[] foods = new String[3];

        for(int i = 0; i < 5; i++){
            if(i == foods.length){
                System.out.println("No more memory available");
                break;
            }
            foods[i] = scanner.nextLine();

        }
        System.out.println("Your top foods are: ");
        for (int i = 0; i < foods.length; i++){
            System.out.println(foods[i]);
        }
    }
}
