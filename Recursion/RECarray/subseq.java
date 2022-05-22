//Get SUB Sequences

import java.util.*;
public class subseq {
    public static ArrayList<String> sub(String s){
        if(s.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add(" ");
            return base;
        }
        char ch = s.charAt(0);
        String res = s.substring(1);
        ArrayList<String> A1 = sub(res);
        ArrayList<String> newARR = new ArrayList<>();
        for(String value : A1){
            newARR.add(value);
        }
        for(String value : A1){
            newARR.add(ch + value);
        }
        return newARR;
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> ans = sub(s);
        System.out.println(ans);
    }
}
