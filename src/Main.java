import oop.Thing;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1000, "Juan");
        hash.put(3000, "Ana");
        hash.put(1500, "Pepe");

        System.out.println(hash.get(1000));

        hash.remove(3000);
        System.out.println(hash);

        for(int index: hash.keySet()){
            System.out.println(hash.get(index));

        }



    }
}