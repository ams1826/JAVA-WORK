//Print star diagonally form right ton left

import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if((r+c)==(n+1)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}


/*
     *
    *
   *
  *
 *
*

*/