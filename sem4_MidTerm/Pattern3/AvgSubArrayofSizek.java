package Pattern3;


//Question 2️⃣
//Find Average of Subarray of Size K
//
//        Array
//
//arr = [1,3,2,6,-1,4,1,8,2]
//k = 5
//
//Find average of each subarray.
//
//        Windows
//[1,3,2,6,-1] → 11/5 = 2.2
//        [3,2,6,-1,4] → 14/5 = 2.8
//        [2,6,-1,4,1] → 12/5 = 2.4
//        [6,-1,4,1,8] → 18/5 = 3.6
//        [-1,4,1,8,2] → 14/5 = 2.8


import java.util.*;
public class AvgSubArrayofSizek {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        int sum = 0;
        int k = input.nextInt();
        for(int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
        System.out.println(sum / (double)k);
        for(int i = k ; i < size ; i++){
            sum = sum - arr[i - k];
            sum = sum + arr[i];
            System.out.println(sum / (double)k);
        }

    }
}
