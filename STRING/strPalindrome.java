//Printing every pallindrome present in a string

import java.util.Scanner;
public class strPalindrome {

    public static boolean isPallindrome(String ss){
        int left = 0;
        int right = ss.length()-1;
        while(left<right){
            if(ss.charAt(left)==ss.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String ss = s.substring(i,j);
                if(isPallindrome(ss)==true){
                    System.out.println(ss+" ");
                }
            }
            System.out.println();
        }
    }
}

/*

Input : AASDD

output : A      A       S       D       D
         AA                     DD

*/