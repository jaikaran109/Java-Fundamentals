package Sem4EndTerm;
import java.util.*;
public class reverseArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        int[] ans = new int[size];
        for(int i = size - 1 ; i >= 0 ; i--){
            ans[size - i - 1] = arr[i];
        }
        for(int i = 0 ; i < size  ; i++){
            System.out.print(ans[i] + " ");
        }
    }
}





// class Solution {
//     public void reverseArray(int arr[]) {
//         int n = arr.length;
//         for(int i = 0 ; i < n / 2 ; i++){
//             int temp = arr[i];
//             arr[i] = arr[n - i - 1];
//             arr[n - i - 1] = temp;
//         }
//     }
// }
