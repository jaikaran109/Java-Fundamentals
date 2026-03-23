package Assessment4;
import java.util.*;
public class removeDuplicates {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        boolean[] seen = new boolean[256];
        StringBuilder res = new StringBuilder();
        for(char c : str.toCharArray()){
            if(!seen[c]){
                seen[c] = true;
                res.append(c);
            }
        }
        System.out.println(new String(res));
    }
}
