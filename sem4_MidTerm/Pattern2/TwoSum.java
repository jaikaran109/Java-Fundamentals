package pattern2;



//Problem 2: Two Sum II
//        (Sorted Array)
//        Example:
//        numbers = [2,7,11,15]
//        target = 9
//        Approach
//        Since array is sorted:
//        left = 0
//        right = n-1
//        Check sum.
//        Case 1:
//        sum > target
//        Move right pointer.
//        right--
//        Case 2:
//        sum < target
//        Move left pointer.
//        left++
//        Case 3:
//        sum == target
//        Return answer.
//        Complexity
//        Time O(n)
//        Space O(1)


import java.util.*;
public class TwoSum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        int target = input.nextInt();

        int l = 0;
        int r = size - 1;
        while(l < r){
            int sum = arr[l] + arr[r];
            if(sum == target) {
                System.out.println("[" + l + "," + r + "]");
                return ;
            }
            if(sum > target){
                r--;
            }else{
                l++;
            }
        }
        System.out.println("Pair nhi h");
    }
}
