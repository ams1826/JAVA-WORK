//Printing order 3 2 1 1 2 3

package Recursion;
import java.util.*;
public class second {
    public static void print(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(n);
    }
}
