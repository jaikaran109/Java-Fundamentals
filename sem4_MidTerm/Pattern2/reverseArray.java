package pattern2;
import java.util.*;
public class reverseArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Original -- ");
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = size - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Rversed -- ");
        System.out.println(Arrays.toString(arr));
    }
}
