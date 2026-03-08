package pattern2;


//Example:
//        nums = [-1,0,1,2,-1,-4]
//        Find triplets that sum to 0.
//        Output:
//        [-1,-1,2]
//        [-1,0,1]
//        Key Idea
//        1. Sort the array.
//        2. Fix one element.
//        3. Use two pointers for remaining two elements.
//        Example:
//        for i
//        left = i+1
//        right = n-1
//        Check sum.
//        Move pointers accordingly.
//        Complexity
//        Time: O(n²)


import java.util.*;
public class ThreeSum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < size ; i++){
            int temp = arr[i];

            if (i > 0 && arr[i] == arr[i-1]) continue;


            int l = i + 1;
            int r = size - 1;
            while(l < r){
                int sum = temp + arr[l] + arr[r];
                if(sum == 0){
                    System.out.println("[" + temp + "," + arr[l] +","+arr[r]);
                    l++;
                    r--;

                    while(l < r && arr[l] == arr[l-1]) l++;
                    while(l < r && arr[r] == arr[r+1]) r--;
                }else if(sum < 0){
                    l++;
                }else{
                    r--;
                }
            }
        }
    }
}
