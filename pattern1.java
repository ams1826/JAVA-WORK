//Print triangle right angled at left

import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=0;
        while(i<n){
            for(int j=0; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
            i++;
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