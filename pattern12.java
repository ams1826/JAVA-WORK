//Printing equivalent triangle

import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row=1,stars=1,spaces=n-1;
        while(row<=n){
            //spaces
            for(int i = 1;i<=spaces;i++){
                System.out.print(" ");
            }

            //stars
            for(int i = 1;i<=stars;i++){
                System.out.print("* ");
            }
            System.out.println();
            //preparing for the next row
            stars++;
            spaces--;
            row++;
            
        }
        
    }
}


/*

   *
  * *
 * * *
* * * *
*/