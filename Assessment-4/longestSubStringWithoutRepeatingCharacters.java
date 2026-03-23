package Assessment4;
import java.util.*;
public class longestSubStringWithoutRepeatingCharacters {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        HashSet<Character> set = new HashSet<>();
        int l=0, max=0;
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r-l+1);
        }
        System.out.println(max);
    }
}
