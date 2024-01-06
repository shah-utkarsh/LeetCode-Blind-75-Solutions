package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubArrayTest {
    @Test
    void testMaxSubArrayExample1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, MaximumSubArray.maxSubArray(nums));
    }

    @Test
    void testMaxSubArrayExample2() {
        int[] nums = {1};
        assertEquals(1, MaximumSubArray.maxSubArray(nums));
    }

    @Test
    void testMaxSubArrayExample3() {
        int[] nums = {5, 4, -1, 7, 8};
        assertEquals(23, MaximumSubArray.maxSubArray(nums));
    }

    @Test
    void testMaxSubArrayAllNegative() {
        int[] nums = {-2, -3, -4, -1, -2};
        assertEquals(-1, MaximumSubArray.maxSubArray(nums));
    }

    @Test
    void testMaxSubArrayAllPositive() {
        int[] nums = {2, 3, 4, 1, 2};
        assertEquals(12, MaximumSubArray.maxSubArray(nums));
    }
}
