package org.example.arrays;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Pass 1 find the min value
        for( int i = 0 ; i < prices.length ; i ++){
            if( prices[i] < minPrice){
                minPrice = prices[i];
            }

            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(currentProfit, maxProfit);
        }

        return maxProfit;
    }
}
