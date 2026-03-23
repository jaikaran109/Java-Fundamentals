package Assessment4;
import java.util.*;
public class countWords {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.trim().split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}
