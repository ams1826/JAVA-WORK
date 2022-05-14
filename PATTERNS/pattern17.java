//Print houw glass

import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int row=1,stars=n,spaces=0;
      while(row<=n){
//spaces___________
        for(int i=1;i<=spaces;i++){
          System.out.print("  ");
        }
//stars____________
        for(int i=1;i<=stars;i++){
          if(row>1 && row<n/2+1){
            if(i==1 || i==stars){
              System.out.print("* ");
            }else{
              System.out.print("  ");
            }
          }else{
            System.out.print("* ");
          }
        }
        System.out.println();
//preparing for the next line
        if(row<=n/2){
          stars-=2;
          spaces++;
        }else{
          stars+=2;
          spaces--;
        }
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



//__________________________________________________________________________________________________________________



// //Print houw glass

// import java.util.Scanner;
// public class pattern17 {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
//       int n = scn.nextInt();
//       int row=1;
//       while(row<=n){
//       //stars
//         for(int i=1; i<=n; i++){
//           if(row==1 || row==n || row==i || row+i==n+1){
//             System.out.print("* ");
//           }
//           else  if(row>n/2+1 && row+i>n && row==i){
//             System.out.print("* ");
//           }
//           else{
//             System.out.print("  ");
//           }
//         }
//         System.out.println();
//         row++;
//       }
//     }
// }


// /*

// * * * * *
//   *   *
//     *
//   * * *
// * * * * *

// */