package basics;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTables {
    public static void main(String args[]){
        Hashtable<Integer, String> dataTable = new Hashtable<>();

        dataTable.put(101, "Harry");//Inserting values to the hash table
        dataTable.put(102, "Potter");
        dataTable.put(103, "IronMan");
        dataTable.put(104, "Hallo");

        System.out.println( dataTable.get(102));//Getting a hashtable value




    }
}
