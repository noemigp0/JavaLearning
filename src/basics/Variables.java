package basics;

public class Variables {
    public static void main (String argss[]){
        int myEntireVariable = 10;
        System.out.println(myEntireVariable);

        myEntireVariable = 5;
        System.out.println(myEntireVariable);

        String myStringVar = "Saludos";
        System.out.println(myStringVar);

        myStringVar = "Adios";
        System.out.println(myStringVar);

        var myIntegerVariable = 1;
        System.out.println(myIntegerVariable);


        var myStringVariable = "Hola";
        System.out.println("mi variable string contiene: " + myStringVariable);

        //Naming convention
        var myVariable = 1;
        var _myVariable = 2;
        var $myVariable = 3;


        //Concatenation
        var user = "Juan";
        var title = "Engineer";
        var union = user + " " + title;

        var i = 3;
        var j = 4;

        /*System.out.println(union);
        System.out.println( i + j + union);
        System.out.println(union + i + j);
        System.out.println(union + ( i + j ));*/

        //Special characters
        var name = "Noemi";
        System.out.println("Line break :\n" + name);//line break
        System.out.println("Tabulator:\t" + name);//tabulator
        System.out.println("Deleting spaces:\b" + name);//Deleting spaces
        System.out.println("Apostrophe  and quotes \' " + name +"\"");

    }
}
