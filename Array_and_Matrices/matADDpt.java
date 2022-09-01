/*
adding values of matrix in pattern
A = adding outer values of matrix  (outer 4 walls)
B = adding values of matrix forming X  (pattern X)

now adding A and B
make sure no value is repeated in the process 
i.e. remove repeated values from B before adding to A

    A  B  C  D  E          A  B  C  D  E
    F  G  H  I  J          F           J        G     I
    K  L  M  N  O      =   K           O   +       M
    P  Q  R  S  T          P           T        Q     S
    U  V  W  X  Y          U  V  W  X  Y

                            adding all values of square
                                    +
                            adding all values of X  (non repeating)

*/

// 1. PROGRAM USING SINGLE LOOP

import java.util.*;

public class matADDpt {

    public static void add(int mat[][] , int n){
        int r = 1;
        int count = 0;
        for(int  c=1; c<=n; c++){
                //adding top wall_______________________________________
            if(r==1){
                count = count + mat[r-1][c-1];
                if(c==n){
                    r++;
                    c=0;
                }
            }

                //adding bottom wall____________________________________
            else if(r==n)
            count = count + mat[r-1][c-1];

                //adding side wall______________________________________
            else if((c==1) || (c==n)){
                count = count + mat[r-1][c-1];
                if(c==n){
                    r++;
                    c=0;
                }
            }

                //adding elements in cross way__________________________
            else if((r==c) || (r+c)==(n+1))
            count = count + mat[r-1][c-1];
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        add(mat , n);
    }
}





// 2. PROGRAM USING MULTIPLE LOOPS

// import java.util.Scanner;
// public class matADDpt {
//     public static void matri(int mat[][] , int n) {
//         int Rmin = 0 , Cmin = 0;
//         int Rmax = mat.length-1 , Cmax = mat[0].length-1;
//         int count = 0;
//     // outer wall_____________________________________________
//             //top wall________________________
//         for(int c=Cmin ; c<Cmax ; c++){
//             count = count + mat[Rmin][c];
//             // System.out.print(count);
//         }
    
//             //right wall______________________
//         for(int r=Rmin ; r<Rmax ; r++){
//             count = count + mat[r][Cmax];
//             // System.out.print(count);
//         }
    
//             //bottom wall_____________________
//         for(int c=Cmax ; c>Cmin ; c--){
//             count = count + mat[Rmax][c];
//             // System.out.print(count);
//         }
    
//             //left wall_______________________
//         for(int r=Rmax ; r>Rmin ; r--){
//             count = count + mat[r][Cmin];
//             // System.out.print(count);
//         }

//     //iner X__________________________________________________
//         for(int r=1; r<=n; r++){
//             for(int c=1; c<=n; c++){
//                 if(r==c || (r+c)==(n+1)){
//                     count = count + mat[r-1][c-1];
//                 }
//             }
//         }
    
//     //removing repeated values________________________________
//         count = count - mat[0][0] - mat[0][n-1] - mat[n-1][0] - mat[n-1][n-1];

//         System.out.println(count);
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int mat[][] = new int[n][n];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 mat[i][j] = scn.nextInt();
//             }
//         }

//         matri(mat,n);
//     }
// }