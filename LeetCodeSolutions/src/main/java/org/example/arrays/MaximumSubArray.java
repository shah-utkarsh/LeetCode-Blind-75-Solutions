package org.example.arrays;

import java.sql.SQLOutput;

public class MaximumSubArray {

    public static void main(String[] args) {
         int[]  nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = maxSum;

        for(int i = 1 ; i < nums.length ; i++){
            currentSum = Math.max(nums[i] + currentSum , nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
