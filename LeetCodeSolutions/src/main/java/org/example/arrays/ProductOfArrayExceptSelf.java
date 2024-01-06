package org.example.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] updatedArray = new int[len];

        // products from left to right side
        int[] leftSideProd = new int[len];
        leftSideProd[0] = 1;
        for(int i = 0 ; i < len - 1; i++){
            leftSideProd[i+1] = leftSideProd[i] * nums[i];
        }

        // products from right to left   side
        int[] rightSideProd = new int[len];
        rightSideProd[len-1] = 1;
        for(int i = len - 1 ; i > 0; i--){
           rightSideProd[i-1] = rightSideProd[i] * nums[i];
        }


        // updated answer
        for(int i = 0 ; i < len ; i++){
            updatedArray[i] = leftSideProd[i] * rightSideProd[i];
        }

    return updatedArray;
    }
}

