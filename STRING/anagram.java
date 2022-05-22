
import java.util.*;
public class anagram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        int l1 = str1.length();
        int l2 = str2.length();
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i=0 ; i<l1 ; i++){
            int idx = str1.charAt(i) - 'a';
            arr1[idx]++;
        }
        for(int i=0 ; i<l2 ; i++){
            int idx = str2.charAt(i) - 'a';
            arr2[idx]++;
        }
        for(int i=0 ; i<26 ; i++){
            if(arr1[i] != arr2[i]){
                System.out.print("not anagram");
                return ;
            }
        }
        System.out.print("number is anagram");
    }
}




// in phone pic
// 21 / 05 / 2021