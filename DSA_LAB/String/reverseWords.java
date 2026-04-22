package String;
import java.util.*;

public class reverseWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String[] words = str.split("\\s+"); // split on spaces

        String result = "";

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            String rev = "";

            for(int j = 0; j < word.length(); j++){
                rev = word.charAt(j) + rev; // reverse each word
            }

            result = result + rev;

            if(i != words.length - 1){
                result = result + " ";
            }
        }

        System.out.println(result);
    }
}




//String str = input.nextLine();
//String[] words = str.split("\\s+");
//StringBuilder result = new StringBuilder();
//for(int i = 0; i < words.length; i++){
//  String word = words[i];
//  StringBuilder rev = new StringBuilder();
//      for(int j = 0; j < word.length(); j++){
//          rev.insert(0, word.charAt(j)); // reverse
//      }
//  result.append(rev);
//  if(i != words.length - 1){
//      result.append(" ");
//      }
//   }
//System.out.println(result.toString());
//}
