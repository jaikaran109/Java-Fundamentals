package Sem4EndTerm;
import java.util.*;
public class sumSubarrayOFsizeK {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        int k = input.nextInt();

        int sum = 0;
        int maxSum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
        maxSum = sum;
        for(int i = k ; i < n ; i++){
            sum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
    }
}
