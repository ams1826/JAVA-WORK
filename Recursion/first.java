//Printing in Increasing order(1 2 3) and Decreasing order(3 2 1)

package Recursion;
import java.util.*;
public class first {
//Printing 1 2 3 4 5
    public static void printINC(int n) {
        if(n==0){
            return;
        }
        printINC(n-1);
        System.out.println(n);
    }
//Printing 5 4 3 2 1
    public static void printDEC(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printDEC(n-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printINC(n);
        printDEC(n);
    }
}
