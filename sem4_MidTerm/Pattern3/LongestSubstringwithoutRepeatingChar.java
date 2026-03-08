package Pattern3;


//Problem 2: Longest
//Substring Without
//Repeating Characters
//Example:
//s = "abcabcbb"
//Answer:
//        3
//Substring:
//abc
//        Approach
//Use:
//HashSet + Sliding Window
//Algorithm:
//left = 0
//set = {}
//        for right:
//        while duplicate found:
//remove s[left]
//left++
//add s[right]
//update max length
//        Complexity
//O(n)


import java.util.*;
public class LongestSubstringwithoutRepeatingChar {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int left = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
        input.close();
    }
}
