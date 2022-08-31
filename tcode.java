/*
adding values of matrix in pattern
A = adding outer values of matrix  (outer 4 walls)
B = adding values of matrix forming X  (pattern X)

now adding A and B
make sure no value is repeated in the process 
i.e. remove repeated values from B before adding to A

*/
import java.util.Scanner;
public class tcode {
    public static void matri(int mat[][] , int n) {
        int Rmin = 0 , Cmin = 0;
        int Rmax = mat.length-1 , Cmax = mat[0].length-1;
        int count = 0;
    // outer wall_____________________________________________
            //top wall________________________
        for(int c=Cmin ; c<Cmax ; c++){
            count = count + mat[Rmin][c];
            // System.out.print(count);
        }
    
            //right wall______________________
        for(int r=Rmin ; r<Rmax ; r++){
            count = count + mat[r][Cmax];
            // System.out.print(count);
        }
    
            //bottom wall_____________________
        for(int c=Cmax ; c>Cmin ; c--){
            count = count + mat[Rmax][c];
            // System.out.print(count);
        }
    
            //left wall_______________________
        for(int r=Rmax ; r>Rmin ; r--){
            count = count + mat[r][Cmin];
            // System.out.print(count);
        }

    //iner X__________________________________________________
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if(r==c || (r+c)==(n+1)){
                    count = count + mat[r-1][c-1];
                }
            }
        }
    
    //removing repeated values________________________________
        count = count - mat[0][0] - mat[0][n-1] - mat[n-1][0] - mat[n-1][n-1];

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

        matri(mat,n);
    }
}