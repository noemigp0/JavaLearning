package basics;
import java.util.Scanner;

public class MyScanner {


    public static void main(String args[]) {

    System.out.println("Escribe tu nombre: " );
    Scanner console = new Scanner(System.in);
    var name = console.nextLine();
    System.out.println("Escribe tu titulo");
    var title = console.nextLine();
    System.out.println("Nombre: " + name + " Title: " + title);
    }

}
