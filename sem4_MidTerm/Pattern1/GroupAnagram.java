package Pattern1;


//Problem 4: Group
//        Anagrams
//Example
//["eat","tea","tan","ate","nat","bat"]
//Output
//["eat","tea","ate"]
//        ["tan","nat"]
//        ["bat"]
//Key Idea
//All anagrams have same sorted form
//Example
//eat → aet
//tea → aet
//ate → aet
//        Approach
//Use HashMap
//sorted word → list of words
//Example Map
//aet : [eat, tea, ate]
//ant : [tan, nat]
//abt : [bat]
//Complexity
//Time O(n * k log k)
//Where
//        k = word length


import java.util.*;
public class GroupAnagram {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String[] str = new String[size];
        for (int i = 0; i < size; i++) {
            str[i] = input.next();
        }
        boolean[] visited = new boolean[size];
        for(int i = 0 ; i < size ; i++){
            if(visited[i]) continue;
            System.out.print("[ "+str[i]);
            visited[i] = true;
            for(int j = i + 1 ; j < size ; j++){
                if(isAnagram(str[i],str[j])){
                    System.out.print(","+str[j]);
                    visited[j] = true;
                }
            }
            System.out.println(" ]");
        }
    }

    private static boolean isAnagram(String a , String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x,y);
    }
}
