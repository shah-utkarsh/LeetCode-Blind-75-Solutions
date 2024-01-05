package org.example.arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        System.out.println(containsDuplicate(nums));
    }


    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();

        for( int num: nums){
            // hashSet.add returns true if that value is not present in the set and reutnrs false if that value is present in the set.
            if( hashSet.add(num) == false){
                return true;
            }
        }
        return false;
    }


}
