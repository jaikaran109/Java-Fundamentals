package Stack;
import java.util.*;
public class validParentheses {
    public static boolean check(char[] arr) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if (st.isEmpty()) return false;
                char top = st.peek();
                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();  // true if all matched
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.next().charAt(0);
        }
        System.out.println(check(arr));
    }
}

// Time Complexity : O(n)
