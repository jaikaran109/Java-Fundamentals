package String;

//Problem Statement
//You are given a string representing a user-entered phrase. Due to formatting inconsistencies, the string may contain uppercase letters, lowercase letters, spaces, and special characters.
//Your task is to determine whether the given string is a palindrome, considering only alphanumeric characters and ignoring cases.
//Return true if the string is a palindrome, otherwise return false.
//📥 Input Format
//A string s
//📤 Output Format
//Return a boolean value:
//   true → if palindrome
//   false → otherwise
//⚠️ Constraints
//1 <= s.length <= 2 * 10^5
//s may contain:
//Uppercase and lowercase English letters
//        Digits
//Spaces
//Special characters
//🧪 Examples
//Example 1
//Input:
//s = "A man, a plan, a canal: Panama"
//Output:
//        true
//Example 2
//Input:
//s = "race a car"
//Output:
//        false
//Example 3
//Input:
//s = " "
//Output:
//        true
//Example 4
//Input:
//s = "Madam"
//Output:
//        true

import java.util.*;
public class checkPalindromeString {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0 ; i < str.length() / 2 ; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                System.out.println("NAAAAAAAAAAHHHHHHHHH");
                return;
            }
        }
        System.out.println("YEAAAHHHHHHHHH");
    }
}
