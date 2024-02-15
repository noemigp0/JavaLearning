package leetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxSubArray {

    public static void main(String args[]){
        //int ex1[] = {4,-5, 6, 1,7, 5,-1,2};
        int ex1[] = {-2,1,-3, 4,-1, 2, 1,-5, 4};
        int targetSum = 6;
        System.out.print(findMaxSubArrayLengthWithSum(ex1,targetSum));
    }

    private static int findMaxSubArrayLengthWithSum(int [] ar, int target){
        List<Integer> prevArray = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

       for (int i = 0; i < ar.length; i++){
           int accumulador = ar[i];
           prevArray.add(ar[i]);

            for(int j = i + 1; j < ar.length; j++){
                accumulador += ar[j];
                prevArray.add(ar[j]);

                if(accumulador == target){
                    System.out.println(prevArray);
                    sizes.add(prevArray.size());
                    break;
                }
            }
           prevArray.clear();



       }

       System.out.println("sizes" +sizes);
       sizes.sort(Integer::compareTo);
    System.out.println(sizes);







        return 0;
    }
}
