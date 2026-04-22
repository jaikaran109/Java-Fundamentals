package String;
import java.util.*;

public class removeSpacesFromString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
