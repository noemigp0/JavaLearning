package basics.fundamentals;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){

        int [] arbitraryNumbers = { 75, 9, 350, 7, 4192};


        for (int i = arbitraryNumbers.length-1; i >= 0 ; i--){
            //System.out.println(arbitraryNumbers[i]);
        }


        double[] bar= new double[3];
        //System.out.println(bar[0]);// the default values into an initialized array is 0 or 0.0

        Scanner scanner = new Scanner(System.in);

        String[] predictions = new String[3];
        predictions[0] = "a pioneer";
        predictions[1] = "loved by many";
        predictions[2] = "very wealthy";

        System.out.println("I will predict your future. Choose 1,2 or 3: " );
        int choice = scanner.nextInt();

        System.out.println("In your future you will be " + predictions[choice -1]);






    }
}
