//Printing single value for multiple words

package STRING;

import java.util.Scanner;

public class strrepetion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int p1=1;
        String ss = ""+str.charAt(0);
        while(p1<str.length()){
            if(str.charAt(p1)==str.charAt(p1-1)){
                p1++;
            }else{
                ss = ss + str.charAt(p1);
                p1++;
            }
        }
        System.out.println(ss);
    }
}


/*

wwwwaaadexxxxxx

wadex

*/