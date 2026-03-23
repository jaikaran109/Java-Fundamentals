package Assessment4;
import java.util.*;
public class maxFreqChar {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int[] arr = new int[256];
        for(char ch : str.toCharArray()) arr[ch]++;
        int max = 0;
        char res = ' ';
        for(int i = 0 ; i < 256 ;i++) {
            if (arr[i] > max){
                max = arr[i];
                res = (char)i;
        }
        }
    }
}
