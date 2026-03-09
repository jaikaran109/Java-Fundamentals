package Pattern1;


//Problem Idea
//Given:
//nums = [2,7,11,15]
//target = 9
//Find two numbers whose sum = target.
//Brute Force Approach
//Check all pairs.
//for i
// for j
//Time Complexity
//O(n²)




//Optimized Approach (HashMap)
//        Idea:
//        Store numbers we already visited.
//        target - nums[i]
//        If it exists → answer found.
//        Algorithm
//        create hashmap
//        for each element:
//        complement = target - nums[i]
//        if complement exists in hashmap
//        return answer
//        store nums[i] in hashmap
//        Complexity
//        Time = O(n)
//        Space = O(n)








import java.util.*;
public class TwoSum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < size ; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                System.out.println(rem +" "+arr[i]);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("Not Found  .. ");
    }
}











//import java.util.*;
//public class TwoSum {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] arr = new int[size];
//        for(int i = 0 ; i < size ; i++){
//            arr[i] = input.nextInt();
//        }
//        int target = input.nextInt();
//
//        int l = 0;
//        int r = size - 1;
//        while(l < r){
//            int sum = arr[l] + arr[r];
//            if(sum == target) {
//                System.out.println(arr[l]+" "+arr[r]);
//                return;
//            }else if(sum > target) r--;
//            else l++;
//        }
//    }
//}

