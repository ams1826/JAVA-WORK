//Printing Permutation
/*
    -> Divide the quotient
    -> Append the remainder
    -> Delete the remainder
*/

package STRING;

import java.util.Scanner;

public class permutation {
//Finding FACTORIAL
    public static void PER(String str) {
        int n = str.length();
        int fac = fact(n);
        for(int i=0 ; i<fac ; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp=i;
            for(int div=n ; div>=1 ; div--){
                int q = temp/div;
                int r = temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }
//Finding FACTORIAL
    public static int fact(int n) {
        int f=1;
        while(n>1){
            f = f * n;
            n--;
        }
        return f;
    }
//Main FUNCTION
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        PER(str);
    }
}
