package leetCode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class sum_evennumbers_after_queries {
    public static void main(String args[]){
        sum_evennumbers_after_queries classInstance = new sum_evennumbers_after_queries();
        classInstance.sumEvenAfterQueries(new int[]{1,2,3,4},new int[][]{{1,0}, {-3,1}, {-4,0}, {2,3}});
    }
    public int[] sumEvenAfterQueries(int[]nums, int[][]queries){
        //System.out.println(Arrays.toString(nums));
        //System.out.println(Arrays.deepToString(queries));
        int[] resultList = new int[0];
      /*for (int i = 0; nums.length >i; i++){
          System.out.println(nums[i]);


        }*/
        System.out.println("Accessing to queries values");
      for (int i = 0; queries.length > i; i++ ) {
          //System.out.println("i = "+i);
         for(int j = 0; j < queries[i].length; j++){

             //System.out.print("queries" + queries[i][j]+", ");

             System.out.print("nums: "+nums[j]+ " ");


         }
      }


        return resultList;

    }
}
