package Assessment4;
import java.util.*;
public class isSubstring {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String gtr = input.next();
        if(str.contains(gtr)) System.out.println("Found");
        else if(gtr.contains(str)) System.out.println("Found");
        else System.out.println("Not Found");
    }
}
