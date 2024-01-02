package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2,5,7,11};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        //Hashmap
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        // enter the each number from nums in hashmap
        for(int i = 0 ; i < nums.length; i++){
            hashMap.put(nums[i], i);
        }

        //iterate throught the hashmap to find the complement value
        for(int i =0 ; i < nums.length ; i++){
            int complement = target - nums[i] ;

            if(hashMap.containsKey(complement) && hashMap.get(complement) != i){
                return new int[] {i , hashMap.get(complement)};
            }
        }

        return new int[]{};








        // brute force approach
        /**
        for(int i = 0; i < nums.length; i++){
            for(int j =1; j < nums.length ; j++){
                if( nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
        */

    }
}
