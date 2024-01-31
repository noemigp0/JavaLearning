package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String args[]){
       int[] result = twoSumHashMapSolution(new int[]{2,7, 11, 15}, 9);

       for(int i = 0; i < result.length; i++){
           System.out.println(result[i]);
       }

    }
    //My firs solution
    public static int[] twoSum(int[] nums, int target){
        int[] results = new int[2];

        for(int i = 0; i < nums.length; i++){
            for (int j = nums.length -1; j > 0 && j != i; j--){
                if(nums[i] + nums[j] == target){
                    results[0] = i;
                    results[1] = j;
                    return results;
                }

            }

        }

        return results;

    }

    public static int[] twoSumSecondSolution(int[] nums, int target){

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
                }
            }



        return new int[]{};
    }


    public static int[] twoSumHashMapSolution(int[] nums, int target){

        //transformar mi arreglo a un mapa

        Map<Integer, Integer> numsMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            //es mejor poner la llave como el valor y el valor como la llave
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            //se le resta a target el primer numero del ciclo, para verificar si el resultado existe en el arreglo
            int complement = target - nums[i];
            //se busca encontrar el complemento y se busca el complemento como llave en el arreglo, tiene que ser diferente de i para que no sean los mismo numeros
            if (numsMap.containsKey(complement) && numsMap.get(complement) != i) {
                return new int[]{i, numsMap.get(complement)};
            }
        }

        System.out.println(numsMap);

        return new int[]{};

    }
}
