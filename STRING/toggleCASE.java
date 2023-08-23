//Changing uppercase to lowercase & lowercase to uppercase

import java.util.*;
public class toggleCASE {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String str = scn.next();
            StringBuilder sb = new StringBuilder();
            int i=0;
            while(i<str.length()){
                char ch = str.charAt(i);
                if(ch>='a' && ch<='z'){
                    char ans = (char)((ch-'a')+'A');
                    sb.append(ans);
                }
                else if(ch>='A' && ch<='Z'){
                    char ans = (char)((ch-'A')+'a');
                    sb.append(ans);
                }
                i++;
            }
            System.out.println(sb);
        }
    }
}

/*

I/P = A B c D e f g
O/P = a b C d E F G

*/