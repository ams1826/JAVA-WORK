//Printing swastik

import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1 ;
        while(row<=n){
            for(int i=1; i<=n; i++){
                if(i!=n/2 || row==(n/2)+1){
                    if((i>(n/2)+1 && row==n/2) || (row>(n/2)+1 && i==n-1))
                    {
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                    
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

            row++;
        }
    }
}


/*

*   * * *
*   *
* * * * *
    *   *
* * *   *

*/