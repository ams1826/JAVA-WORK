import java.util.Scanner;
public class tcode {
    public static void matri(int mat[][]) {
        int Rmin = 0 , Cmin = 0;
        int Rmax = mat.length-1 , Cmax = mat[0].length-1;
        int count = 0;
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

        matri(mat);
    }
}