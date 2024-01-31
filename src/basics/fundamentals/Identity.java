package basics.fundamentals;

public class Identity {


    public static void main(String args[]){
        //Every object has a memory address that it´s defined when we use the "new" reserved word
        String string1 = new String("Hola");
        String string2 = new String("Hola");

        if(string1 == string2){//Here java is trying to compare the memory addresses instead of the string values
            //System.out.println("Strings  are equal");
        } else {
            //System.out.println("String are not equal");
        }

        if(string1.equals(string2)){ //Here we are accessing to the string values to do de compairson
            System.out.println("Strings  are equal");
        } else {
            System.out.println("String are not equal");
        }

    }
}
