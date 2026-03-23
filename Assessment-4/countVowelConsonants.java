package Assessment4;
import java.util.*;
public class countVowelConsonants {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vowel = 0;
        int cons = 0;
        String str = input.next().toLowerCase();
        char[] ch = str.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] == 'a' || ch[i] == 'u' || ch[i] == 'o' || ch[i] == 'i' || ch[i] == 'e'){
                vowel++;
            }else{
                cons++;
            }
        }
        System.out.println("Vowels -> " + vowel + "Consonants -> "+ cons);
    }
}
