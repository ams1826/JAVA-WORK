//Changing uppercase to lowercase & lowercase to uppercase

import java.util.*;
public class toggleCASE {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=1;
        while(i<str.length()){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                char ans = (char)((ch-'a')+'A');
                char s1 = str.charAt(i);
                char s2 = str.charAt(j);
                int d = s1 - s2;
                char dd= (char)(d);
                sb.append(ans +" "+ dd);
            }
            else if(ch>='A' && ch<='Z'){
                char ans = (char)((ch-'A')+'a');
                char s1 = str.charAt(i);
                char s2 = str.charAt(j);
                int d = s1 - s2;
                char dd= (char)(d);
                sb.append(ans +" "+ dd);
            }
            i++;
            if(j<str.length()-1){
                j++;
            }
        }

        System.out.println(sb);
    }
}

/*

I/P = A B c D e f g
O/P = a b C d E F G

*/