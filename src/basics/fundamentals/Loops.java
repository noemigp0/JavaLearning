package basics.fundamentals;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loops {
    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);
        String again;
        do {
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("You rolled a :" + randomNumber + ".");
            System.out.println("Stop rolling? y/n: ");
            again = scanner.next();

        } while (!again.equals("y"));


    }
}
