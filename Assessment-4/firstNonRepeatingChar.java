package Assessment4;
import java.util.*;
public class firstNonRepeatingChar {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] freq = new char[256];
        for(char ch : str.toCharArray()) freq[ch]++;
        for(char ch : str.toCharArray()){
            if(freq[ch] == 1 ) {
                System.out.println(ch);
                return ;
            }
        }
        System.out.println("No non-repeating character found");
    }
}
