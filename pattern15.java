//Printing  W

import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1;
        while(row<=n){
            for(int i=1; i<=n; i++){
                if(i==1 || i==n){
                    System.out.print("*\t");
                }
                else if(row==i || (row+i)==(n+1) ){
                    if(row>=n/2+1){
                        System.out.print("*\t");

                    }else{
                        System.out.print("\t");
                    }
                    
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            row++;
        }
    }
}

/*

*     *
*     *
*  *  *
* * * *
*     *

*/