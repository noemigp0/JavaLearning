package basics.fundamentals;

public class ExceptionHandling {
    public static void main (String args[]){

        try {
            int myInt = Integer.parseInt("pants");


        } catch(NumberFormatException nfe){
            System.out.println("Hey dude, you can´t make and int out to string" + nfe);

        }

        System.out.println("End here");

    }
}
