//Printing Factorial of a number using recursion

import java.util.*;
public class third {
//Calculating factoeial
    public static int fact(int n) {
        if(n==0){
            return 1;
        }
        int f = fact(n-1);
        int x = n * f;
        return x;
    }
//Giving input
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = fact(n);
        System.out.print(ans);
    }
}
