
import java.util.*;
public class anagram {

    public static boolean anagm(String str1 , String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        StringBuilder st1 = new StringBuilder(str1);
        StringBuilder st2 = new StringBuilder(str2);
        boolean ans = false ;
        if(l1 != l2){
            return false;
        }
        else{
            for(int i=0 ; i<l1 ; i++){
                for(int j=0 ; j<l2 ; j++){
                    if(st1.charAt(i)==st2.charAt(j)){
                        System.out.println(l1 + " " + l2);
                        st1.deleteCharAt(i);
                        st2.deleteCharAt(j);
                        l1 = st1.length();
                        l2 = st2.length();
                        ans = true;
                        break;
                    }
                    else{
                        ans = false;
                    }
                }
            }
            if(ans == true){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        System.out.print(anagm(str1, str2));
    }
}
