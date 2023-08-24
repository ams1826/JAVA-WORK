//Return Longest SubString with no repetition

import java.util.Scanner;

public class noRepeatSubString {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
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