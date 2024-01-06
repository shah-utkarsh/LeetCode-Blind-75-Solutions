package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {

    @Test
    void testProductExceptSelfExample1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testProductExceptSelfExample2() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(nums));
    }
}
