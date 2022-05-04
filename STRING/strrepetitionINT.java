//Printing single value of for multiple words with their
// occurance in a single row

package STRING;

import java.util.*;
public class strrepetitionINT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int p=0;
        int count=1;
        String ss = ""+str.charAt(0);
        while(p+1<str.length()){
            if(str.charAt(p)==str.charAt(p+1)){
                count++;
            }else{
                if(count>1){
                    ss = ss + count + str.charAt(p+1);
                    count = 1;
                }else{
                    ss = ss + str.charAt(p+1);
                    count = 1;
                }
            }
            p++;
        }
        if(count>1){
            ss = ss + count;
        }
        System.out.println(ss);
    }
}

/*

wwwwaaadexxxxxx

w4a3dex6

*/