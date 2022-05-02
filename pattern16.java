//Printing swastik

import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1 ;
        while(row<=n){
            for(int i=1; i<=n; i++){
//Printing 1st half i.e. above n/2+1
//  *   * * *
//  *   *
                if(row<=n/2){
                    if((i==1 || i>=n/2+1) && row==1){
                        System.out.print("* ");
                    }
                    else{
                        if(i==1 || i==n/2+1){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }
//Printing n/2+1 row
//  *   * * *
//  *   *
//  * * * * *
                else if(row==n/2+1){
                        System.out.print("* ");
                }
//Printing 2nd half i.e. below n/2+1 row
//  *   * * *
//  *   *
//  * * * * *
//      *   *
//  * * *   *
                else{
                    if(row==n && (i<=n/2+1 || i==n)){
                        System.out.print("* ");
                    }
                    else if(i==n/2+1 || i==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
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


zjx  iyv
ytcku kuugv
uycy u uvbkiyfjv 
*/