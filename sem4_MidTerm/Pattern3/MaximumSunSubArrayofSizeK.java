package Pattern3;


//Question 1️⃣
//Maximum Sum Subarray of Size K
//
//Array:
//
//arr = [2,1,5,1,3,2]
//k = 3
//
//Find maximum sum of subarray size 3
//
//Step 1 (Normal Approach)
//        [2,1,5] = 8
//        [1,5,1] = 7
//        [5,1,3] = 9
//        [1,3,2] = 6
//
//Answer
//
//9


import java.util.*;
public class MaximumSunSubArrayofSizeK {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        int k = input.nextInt();
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
        int maxSum = sum;
        for(int i = k ; i < size ; i++){
            sum = sum - arr[i - k];
            sum = sum + arr[i];
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}
