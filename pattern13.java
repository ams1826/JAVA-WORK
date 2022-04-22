//Printing arrow

import java.util.Scanner;
public class pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1 , spaces=n/2 , stars=1;
        while(row<=n){
        //space
            for(int i=1; i<=spaces; i++){
                if(row==(n/2)+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if(row<=n/2){
                stars++;
            }
            else{
                stars--;
            }
            row++;
        }
    }
}

/*
    *
    * *
* * * * *
    * *
    *
*/