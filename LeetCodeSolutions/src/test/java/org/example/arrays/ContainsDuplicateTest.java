package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {
    @Test
    void testContainsDuplicateExample1() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicateExample2() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicateExample3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicateEmptyArray() {
        int[] nums = {};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicateSingleElementArray() {
        int[] nums = {9};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicateAllDuplicates() {
        int[] nums = {5, 5, 5, 5, 5};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }
}
