package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfitTest1() {
        BestTimeToBuyAndSellStock best = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;

        int actual = best.maxProfit(prices);

        assertEquals(expected, actual, "Test case 1 failed: ");
    }

    @Test
    void maxProfitTest2() {
        BestTimeToBuyAndSellStock best = new BestTimeToBuyAndSellStock();
        int[] prices = {7,6,4,3,1};
        int expected = 0;

        int actual = best.maxProfit(prices);

        assertEquals(expected, actual, "Test case 2 failed: ");
    }


}
