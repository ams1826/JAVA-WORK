//Printing number raise to some power using recursion
// By dividing the power

package Recursion;
import java.util.*;
public class fifth {
    public static int power(int n , int p){
        if(p==0){
            return 1;
        }
        int po = power(n , p-1);
        int m = n * po;
        // System.out.println(n +" "+ p+" "+po+" "+m);
        return m;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        int ans = power(n,p/2);
    //EVEN
        if(p%2==0){
            ans*=ans;
        }
    //ODD
        else{
            ans*=ans*n;
        }
        System.out.print(ans);
    }
}