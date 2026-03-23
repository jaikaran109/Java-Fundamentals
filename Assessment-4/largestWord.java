package Assessment4;
import java.util.*;
public class largestWord {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s =input.nextLine();
        String[] arr = s.split(" ");
        String res = "";
        for(String word : arr){
            if(word.length() > res.length())
                res = word;
        }
        System.out.println(res);
    }
}
