//Print triangle right angled at left upside down

import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars=0;
        for(int i=1; i<=n; i++){
            stars=(n+1)-i;
            for(int j=1; j<=stars; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

/*
*****
****
***
**
*
*/