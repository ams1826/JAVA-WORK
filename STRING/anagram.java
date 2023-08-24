//ANAGRAM
/*
    I/P : RUN   FUN
    O/P : not anagram

    I/P : ABC   CBA
    O/P : yes it is anagram
*/
import java.util.*;
public class anagram {

//-----------------------------------------------------------------------------
//            TC-> O(nlog(n))         SC-> O(n)
//-----------------------------------------------------------------------------

    // public static boolean areAnagrams(String str1, String str2) {
    //     // Convert both strings to lowercase
    //     str1 = str1.toLowerCase();
    //     str2 = str2.toLowerCase();
        
    //     // Convert strings to char arrays and sort them
    //     char[] arr1 = str1.toCharArray();
    //     char[] arr2 = str2.toCharArray();
    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);
        
    //     // Compare sorted char arrays
    //     return Arrays.equals(arr1, arr2);
    // }




//-----------------------------------------------------------------------------
//            TC-> O(n)         SC-> O(1)
//-----------------------------------------------------------------------------

    public static boolean areAnagrams(String str1, String str2) {
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

        return Arrays.equals(charCount1,charCount2);
    }


    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String str1 = scn.next();
            String str2 = scn.next();
            if(areAnagrams(str1, str2)){
                System.out.print("An anagram");
            }
            else{
                System.out.print("Not an anagram");
            }
        }
        catch(Exception e){
            System.out.println("Error occured " + e.getMessage());
            e.printStackTrace();
        }
    }
}