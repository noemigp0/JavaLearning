package leetCode;

public class TwoSum {

    /*
    * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

           * Example 1:
            Input: nums = [2,7,11,15], target = 9
            Output: [0,1]
            Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

            * Example 2:
            Input: nums = [3,2,4], target = 6
            Output: [1,2]

            * Example 3:
            Input: nums = [3,3], target = 6
            Output: [0,1]
        *
    * */
    public static void main (String args[]){
        //int[] nums = new int[]{2,7,11,15};
        //int target = 9;
        //int[] nums = new int[]{3,3};
        //int target = 6;
        //int[] nums = new int[]{3,2,4};
        //int target = 6;
        int[] nums = new int[]{3,2,3};
        int target = 6;

        int[] results = twoSum(nums, target);


        String stringOfNums = "";
        for(int i = 0; i < results.length; i ++){
            stringOfNums  += results[i] +",";

        }

        System.out.print("[" + stringOfNums.substring(0, stringOfNums.length() -1) + "]");


    }

    public static int[] twoSum(int[] nums, int target){
        int [] results = new int[2];


        for ( int i = 0; i < nums.length; i++){
            for(int j = nums.length -1; j >= 0; j--){
                if(nums[i] + nums[j] == target){
                    results[0] = i;
                    results[1] = j;
                }

            }

        }




        return results;
    }
}
