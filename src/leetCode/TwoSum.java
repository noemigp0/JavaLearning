package leetCode;

public class TwoSum {
    public static void main (String args[]){
        //int[] nums = new int[]{2,7,11,15};
        //int[] nums = new int[]{3,3};
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] results = twoSum(nums, target);


        String stringOfNums = "";
        for(int i = 0; i < results.length; i ++){
            stringOfNums  += results[i] +",";

        }

        System.out.print("[" + stringOfNums.substring(0, stringOfNums.length() -1) + "]");


    }

    public static int[] twoSum(int[] nums, int target){
        int [] result = new int[2];
        int previousIndex = 0;

        for ( int i = 0; i < nums.length; i++){


            if( i > 0 ){

                if((nums[i] + nums[previousIndex]) == target ){
                    result[0] = previousIndex;
                    result[1] = i;
                    break;

                }

            }

            previousIndex = i;

        }




        return result;
    }
}
