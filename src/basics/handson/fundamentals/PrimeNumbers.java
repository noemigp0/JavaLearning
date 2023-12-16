package basics.handson.fundamentals;

public class PrimeNumbers {
    //Write a program which print all the prime numbers from 1 to 1000
    public static void main(String args[]) {

        int initialNumber = 2;

        while (initialNumber <= 1000) {
            int counter = 0;
            for (int div = 1; div <= initialNumber; div++) {
                if ((initialNumber % div == 0) && (initialNumber % 1 == 0)) {
                    counter = counter +1;
                }
            }
            if (counter == 2){
                System.out.println(initialNumber + " is Prime");
            }
        initialNumber++;
        }



    }
}
