//Changing uppercase to lowercase & lowercase to uppercase
// and writing ASCII difference of two consecutive letters between them.

import java.util.*;
public class toggleCASE2 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String str = scn.next();
            StringBuilder sb = new StringBuilder();
            int i=0;
            int j=1;
            while(i<str.length()){
                char ch = str.charAt(i);
                char s1 = str.charAt(i);
                char s2 = str.charAt(j);
                int d = s1 - s2;
                if(ch>='a' && ch<='z'){
                    char ans = (char)((ch-'a')+'A');
                    sb.append(ans +" "+ d +" ");
                }
                else if(ch>='A' && ch<='Z'){
                    char ans = (char)((ch-'A')+'a');
                    sb.append(ans +" "+ d +" ");
                }
                i++;
                if(j<str.length()-1){
                    j++;
                }
            }
            System.out.println(sb);
        }
    }
}

/*

I/P = A B c D e f g
    A(65) B(67) --> 65-67 = -1
                    ''''''''''
O/P = a -1 b -33 C 31 d -33 E -1 F -1 G 0

*/