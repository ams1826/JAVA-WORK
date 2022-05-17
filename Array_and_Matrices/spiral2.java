//Printing layered matrix
/*
    I/P : n = 4
    O/P :
            4   4   4   4   4   4   4

            4     3  3  3  3  3     4

            4     3   2 2 2   3     4

            4     3   2 1 2   3     4

            4     3   2 2 2   3     4

            4     3  3  3  3  3     4

            4   4   4   4   4   4   4 

*/

import java.util.*;
public class spiral2 {
    public static void fill2D(int mat[][] , int n){
        int Rmin = 0 , Cmin = 0;
        int Rmax = mat.length-1 , Cmax = mat[0].length-1;
        int count = 0;
        int a = n;
        while(count<a*a){
            count++;
                //left wall______________________________________
            for(int r=Rmin ; r<=Rmax && count<a*a ; r++){
                mat[r][Cmin] = n ;
            }

                //bottom wall____________________________________
            for(int c=Cmin+1 ; c<=Cmax && count<a*a ; c++){
                mat[Rmax][c] = n ;
            }

                //right wall_____________________________________
            for(int r=Rmax-1 ; r>=Rmin && count<a*a ; r--){
                mat[r][Cmax] = n ;
            }

                //top wall_______________________________________
            for(int c=Cmax-1 ; c>Cmin && count<a*a ; c--){
                mat[Rmin][c] = n ;
            }
            
            Rmin++;
            Cmin++;
            Rmax--;
            Cmax--;
            n--;

        }

    }

//Display the matrix
    public static void Display(int mat[][]) {
        for(int r=0 ; r<mat.length ; r++){
            for(int c=0 ; c<mat[0].length ;c++){
                System.out.print(mat[r][c]+" ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int size = 2*n-1;
        int mat[][] = new int[size][size];
        fill2D(mat , n);
        Display(mat);
    }
}