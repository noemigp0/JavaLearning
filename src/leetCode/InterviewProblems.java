package leetCode;

import java.util.HashMap;
import java.util.Map;

public class InterviewProblems {

    public static void main(String args[]){

        InterviewProblems ip = new InterviewProblems();

        //System.out.println(ip.reverseString("reverse"));

        //System.out.println("Is the number capicua/palyndrome: ?" + ip.numberPalyndrome(121));

        ip.countCharacters("miitocodeo");

    }


    public StringBuilder reverseString(String str){

        StringBuilder sb = new StringBuilder(str);
        StringBuilder sbn = new StringBuilder();

        for(int i = str.length() -1; i >= 0; i--){
            sbn.append(sb.charAt(i));
        }
        return sbn;
    }

    //Determinar si un numero es palindromo


    public boolean numberPalyndrome(int number){

        StringBuilder sb = new StringBuilder(String.valueOf(number));
        StringBuilder sbn = new StringBuilder();

        for(int i = sb.length() -1; i >= 0; i--){
            sbn.append(sb.charAt(i));
        }
        if (sbn.compareTo(sb) == 0) {return true;}

        return false;
    }

    //cantidad de caracteres como coincidencia

    public void countCharacters(String cadena){

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < cadena.length(); i++){
          int  counter = 1;
            if(map.containsKey(cadena.charAt(i))){
               counter = map.get(cadena.charAt(i)) +1;
            }
            map.put(cadena.charAt(i), counter);
        }

       map.forEach((k,v) -> {
          System.out.println("Key:" + k + "Value: " + v);
       });

       /* for(int i = 0; i < cadena.length(); i++){
            int counter = 0;
            for(int j = 0; j < cadena.length(); j++){
                if( cadena.charAt(i) == cadena.charAt(j)){
                    counter++;
                }

            }
            System.out.println(cadena.charAt(i) +": " + counter);
        }*/

    }

}
