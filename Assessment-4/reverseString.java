package Assessment4;
import java.util.*;
public class reverseString {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] ch = str.toCharArray();
        for(int i = 0 ; i < str.length() / 2 ; i++){
            char temp = ch[i];
            ch[i] = ch[str.length() - i - 1];
            ch[str.length() - i - 1] = temp;
        }
        System.out.println(new String(ch));
    }
}
