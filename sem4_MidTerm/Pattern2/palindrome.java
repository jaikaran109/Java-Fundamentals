package pattern2;

//Problem 1: Valid
//        Palindrome
//        Problem Idea
//        Check if string is palindrome ignoring spaces and
//        symbols.
//        Example:
//        "A man, a plan, a canal: Panama"
//        Output:
//        True
//        Approach
//        Use two pointers.
//        left = 0
//        right = n-1
//        Compare characters.
//        If equal → move inward.
//        left++
//        right--
//        Skip non-alphanumeric characters.
//        Algorithm
//        1. Initialize two pointers
//        2. Ignore spaces and symbols
//        3. Compare characters
//        4. If mismatch → false
//        5. If pointers cross → true
//        Complexity
//        Time: O(n)
//        Space: O(1)


import java.util.*;
public class palindrome {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String result = str.toLowerCase().replaceAll("[^a-z]", "");
        if(result.isEmpty()) {
            System.out.println("Kuch letters toh daalo!");
            return;
        }
        for(int i = 0 ; i < result.length() / 2 ; i++){
            if(result.charAt(i) != result.charAt(result.length() - i - 1)) {
                System.out.println("Naaaaahhhhhhh");
                return ;
            }
        }
        System.out.println("Yeahhhhhhh");
        input.close();
    }

}
