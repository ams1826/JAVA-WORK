//Printing number raise to some power using recursion
// By dividing the power

package Recursion;
import java.util.*;
public class fifth {
    public static int power(int n , int p){
        if(p==0){
            return 1;
        }
        int po = power(n , p/2);
        int m = po * po;
        if(p%2 != 0){
            m = m * n;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        int ans = power(n,p);
        System.out.print(ans);
    }
}