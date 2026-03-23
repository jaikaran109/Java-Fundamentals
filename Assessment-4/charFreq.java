package Assessment4;
import java.util.*;
public class CharFreq {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] arr = str.toCharArray();
        int[] freq = new int[256];
        for(char ch : arr) freq[ch]++;
        for(int i = 0 ;  i < 256 ; i++){
            if(freq[i] > 0) System.out.println((char)(i) + " = "+ freq[i]);
        }
    }
}
