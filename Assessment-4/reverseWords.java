package Assessment4;
import java.util.*;
public class reverseWords {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.trim().split("//+s");
        StringBuilder res = new StringBuilder();
        for(String word : words){
            StringBuilder temp = new StringBuilder(word);
            res.append(temp.reverse()).append(" ");
        }
    }
}
