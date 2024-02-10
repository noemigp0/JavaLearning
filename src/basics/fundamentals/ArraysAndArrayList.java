package basics.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

//Array and ArrayList differences
public class ArraysAndArrayList {

    public static void main(String args[]){

        //Array declaration
        String[] string = new String[4];
        //ArrayListDeclaration and initialization
        ArrayList<String> stringsList = new ArrayList<>(Arrays.asList("Carlos","Pedro","Juan","Luis"));
        //initialize an array
        string = new String[]{"Carlos","Pedro","Juan","Luis"};
       //Get an specific value
        System.out.println(string[1]);
        System.out.println(stringsList.get(0));
        //Get the size
        System.out.println("Array size: " + string.length);
        System.out.println("List size: " + stringsList.size());
        //To add a value
        stringsList.add("Noemi");
        //To set an element
        string[0] = "New Carlos";
        stringsList.set(1, "New Pedro");

        //to print values
        for(int i = 0; i < string.length; i++){
            System.out.println(string[i]);
        }

        System.out.println(stringsList);

        //To delete a value
        stringsList.remove(0);
        System.out.println(stringsList);




    }
}
