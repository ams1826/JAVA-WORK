//ANAGRAM
/*
    I/P : RUN   FUN
    O/P : not anagram

    I/P : ABC   CBA
    O/P : yes it is anagram
*/
import java.util.*;
public class anagram {

    public static boolean anagramString(String str1, String str2) {
        String result1 = str1.toLowerCase();
        String result2 = str2.toLowerCase();

        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];
        
        for(char c : result1.toCharArray()){
            charCount1[c - 'a']++;
        }
        for(char c : result2.toCharArray()){
            charCount2[c - 'a']++;
        }

        for(int i=0 ; i<26 ; i++){
            if(charCount1[i] != charCount2[i]){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String str1 = scn.next();
            String str2 = scn.next();
            if(anagramString(str1, str2)){
                System.out.print("An anagram");
            }
            System.out.print("Not an anagram");
        }
    }
}