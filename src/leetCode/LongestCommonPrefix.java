package leetCode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String args[]) {
        String strs[] = new String[3];
        strs[0] = "dog";
        strs[1] = "racecar";
        strs[2] = "car";


        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));



    }


    public String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length -1];
        int idx = 0;

        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }

        }

        return s1.substring(0, idx);
    }
}
