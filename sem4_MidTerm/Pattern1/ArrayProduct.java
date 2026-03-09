package Pattern1;


//Problem 6: Product of Array
//Except Self
//Example
//[1,2,3,4]
//Output
//[24,12,8,6]
//Trick
//        Use
//prefix product
//suffix product
//Example
//        Prefix
//[1,1,2,6]
//Suffix
//[24,12,4,1]
//Multiply.
//        Complexity
//O(n)
//No division used.


import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class ArrayProduct {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        int[] pre = new int[size];
        pre[0] = arr[0];
        for(int i = 1 ; i < size ; i++){
            pre[i]  = arr[i] * pre[i-1];
        }

        int[] suff = new int[size];
        suff[size - 1] = arr[size - 1];
        for(int i = size - 2 ; i >= 0 ; i++){
            suff[i] = arr[i] * suff[i+1];
        }
        int[] ans = new int[size];
        for(int i = 0 ; i < size ; i++){
            if(i == 0) ans[i] = suff[i + 1];
            else if(i == size - 1) ans[i] = pre[i - 1];
            else ans[i] = pre[i - 1] * suff[i + 1];
        }
        System.out.println(Arrays.toString(ans));
    }

}
