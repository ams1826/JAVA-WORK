//Return Longest SubString with no repetition

import java.util.Scanner;

public class noRepeatSubString {

    public static String subStringNoRepeat(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seenChar = new boolean[26];
        for(char c : str.toCharArray()){
            if(!seenChar[c - 'a']){
                seenChar[c - 'a'] = true;
                result.append(c);
                // System.out.println(c);
            }
        }
        return result.toString();
    }




    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String str = scn.next();
            System.out.println(subStringNoRepeat(str));
        }
        catch(Exception e){
            System.out.println("Error occured " + e.getMessage());
            e.printStackTrace();
        }
    }
}


/*

wwwwaaadexxxxxx

wadex

*/