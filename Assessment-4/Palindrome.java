package Assessment4;
import java.util.*;
public class Palindrome {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        for(int i = 0 ; i < str.length() / 2 ; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                System.out.println("Not Palindrome");
                return ;
            }
        }
        System.out.println("Palindrome");
    }
}
