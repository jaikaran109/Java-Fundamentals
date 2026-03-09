package Pattern1;


//Problem 2: Contains
//        Duplicate
//Question
//Check if array contains duplicate elements.
//Example
//[1,2,3,4,1]
//Answer → True
//        Approach
//Use HashSet
//Algorithm
//create set
//for element in array
// if element already in set
//duplicate found
// else
//add element
//Complexity
//Time O(n)
//Space O(n)




import java.util.*;
public class ContainsDuplicate {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        HashSet<Integer> map = new HashSet<>();
        for(int num : arr){
            if(map.contains(num)){
                System.out.println("Duplicate Found -- ");
                return ;
            }
            map.add(num);
        }
        System.out.println("No Duplicate -- ");
    }
}





//import java.util.*;
//public class ContainsDuplicate {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] arr = new int[size];
//        for(int i = 0 ; i < size ; i++){
//            arr[i] = input.nextInt();
//        }
//        Arrays.sort(arr);
//        int i = 0;
//        int j = 1;
//        while(j < size){
//            if(arr[i] == arr[j]){
//                System.out.println("Duplicate Found");
//                return;
//            }
//            i++;
//            j++;
//        }
//        System.out.println("No Duplicate");
//    }
//}
