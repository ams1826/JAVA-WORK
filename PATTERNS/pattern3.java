//Print triangle right angled at right

import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n; i++){
            int stars=i;
            int spaces = n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print("\t");
            }
            for(int k=1; k<=stars; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

/*
    *
   **
  ***
 ****
*****
*/