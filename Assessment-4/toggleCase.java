package Assessment4;
import java.util.*;
public class toggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
