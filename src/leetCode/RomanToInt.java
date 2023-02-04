package leetCode;

import java.lang.reflect.Array;
import java.util.HashMap;

public class RomanToInt {

    public int romanToInt(String s) {

        HashMap<String, Integer> romanMap = new HashMap<>();

        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        int acct = 0;
        int index = s.length() - 1;
        int preValue = 0;
        int currentValue = 0;

        while (index >= 0) {

            currentValue = romanMap.get(String.valueOf(s.charAt(index)));

            if (currentValue < preValue) {
                acct -= currentValue;
            }

            if (currentValue >= preValue) {
                acct += currentValue;
            }

            preValue = romanMap.get(String.valueOf(s.charAt(index)));
            index--;
        }
        return acct;
    }

    public static void main(String args[]) {
        RomanToInt tranformerObj = new RomanToInt();
        int integerNumber = tranformerObj.romanToInt("MCMXCIV");
        System.out.println("El numero entero es: " + integerNumber);


    }
}
