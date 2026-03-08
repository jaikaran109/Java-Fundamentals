package pattern2;

//8⃣ Problem 4: Container
//        With Most Water
//        Given heights of vertical lines.
//        Find maximum water container.
//        Example:
//        [1,8,6,2,5,4,8,3,7]
//        Approach
//        Use two pointers.
//        left = 0
//        right = n-1
//        Area formula:
//        area = min(height[left], height[right]) * width
//        Move pointer with smaller height.
//        Reason:
//        smaller wall limits water
//        Complexity
//          O(n)


import java.util.*;
public class ContainMostWater {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int left = 0;
        int right = size - 1;
        int area = 0;
        while(left < right){
            int x = right - left ;
            int temp = Math.min(arr[left] , arr[right] ) * x;
            area = Math.max(area,temp);
            if(arr[left] < arr[right]) left++;
            else right--;
        }
        System.out.println(area);
    }
}
