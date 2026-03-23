package Assessment4;
import java.util.*;
public class anagram {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String gtr = input.next();
        if (str.length() != gtr.length()) {
            System.out.println("Not Anagram");
            return;
        }
        int[] arr = new int[26];
        for (int i = 0; i < str.length() ; i++){
            arr[str.charAt(i) - 'a']++;
            arr[gtr.charAt(i) - 'a']--;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
