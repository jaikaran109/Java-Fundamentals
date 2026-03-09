package Pattern1;


//Problem 3: Valid Anagram
//Two strings are anagrams if they contain same characters
//with same frequency.
//        Example:
//listen
//        silent
//Approach
//Use character frequency map
//HashMap<Character, Count>
//        Algorithm
//count frequency of s
//decrease frequency using t
//if any mismatch → false
//Alternative approach:
//sort both strings
//But sorting costs:
//O(n log n)
//Better approach:
//HashMap O(n)










import java.util.*;
public class ValidAnagram {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String gtr = input.next();

        if(str.length() != gtr.length()){
            System.out.println("NO");
            return;
        }


        int[] arr = new int[256];
        for(int i = 0 ; i < str.length() ; i++){
            arr[str.charAt(i)]++;
            arr[gtr.charAt(i)]--;
        }
        for(int i : arr){
            if(i != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("Yes");
    }
}
