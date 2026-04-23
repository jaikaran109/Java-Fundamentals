package Stack;
import java.util.*;
public class reverseStringUsingStack {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            st.push(str.charAt(i));
        }
        while(!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }
}
