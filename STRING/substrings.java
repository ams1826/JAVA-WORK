package STRING;

import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String ss = s.substring(i,j);
                System.out.println(ss+" ");
            }
            System.out.println();
        }
    }
}
