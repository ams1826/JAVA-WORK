//Print houw glass

import java.util.Scanner;
public class tcode {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int row=1;
      while(row<=n){
        for(int i=1; i<=n; i++){
          if(row==1 || row==n || row==i || row+i==n+1){
            System.out.print("* ");
          }
//          else  if(row>n/2+1 && row+i>n){
//            System.out.print("* ");
//          }
          else{
            System.out.print("  ");
          }
        }
        System.out.println();
        row++;
      }
    }
}


/*

* * * * *
  *   *
    *
  * * *
* * * * *

*/