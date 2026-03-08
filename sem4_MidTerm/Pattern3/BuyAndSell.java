package Pattern3;


//Problem 1: Best Time to
//Buy and Sell Stock
//Example:
//prices = [7,1,5,3,6,4]
//Best profit:
//buy = 1
//sell = 6
//profit = 5
//Approach
//Track minimum price so far.
//        Algorithm:
//minPrice = infinity
//        maxProfit = 0
//for price in prices:
//minPrice = min(minPrice, price)
//profit = price - minPrice
//        maxProfit = max(maxProfit, profit)
//Complexity
//Time O(n)
//Space O(1)


import java.util.*;
public class BuyAndSell {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0 ; i < size ; i++){
            minPrice = Math.min(minPrice,arr[i]);
            int profit = arr[i] - minPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        System.out.println(maxProfit);
    }
}
