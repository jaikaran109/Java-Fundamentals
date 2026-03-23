package Assessment4;
import java.util.*;
public class removeSpaces {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        String str = input.nextLine();

        String res = str.replace(" ", "");

        System.out.print(res);

    }
}
