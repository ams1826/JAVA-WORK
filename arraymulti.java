// Multiply 2D arrays

// algo name :: Strassen's Algorithm for matrix multiplication

import java.util.Scanner;
public class arraymulti {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1=2 , c1=3;
        int r2=3 , c2=3;
        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];
        int mat3[][] = new int[r1][c2];
        System.out.println("enter values for mat1");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        System.out.println("enter values for mat2");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                arr2[i][j] = scn.nextInt();
            }
        }

        if(c1!=r2){
            System.out.println("wrong size of matrix");
        }
        else{
            for(int r=0; r<mat3.length; r++){
                for(int c=0; c<mat3[0].length; c++){
                    for(int k=0; k<c1; k++){
                        mat3[r][c] = mat3[r][c] + (arr1[r][k]*arr2[k][c]);
                    }
                }
            }
        }
//Printing mat3
        for(int i=0; i<mat3.length; i++){
            for(int j=0; j<mat3[0].length; j++){
                System.out.print(mat3[i][j]+"\t");
            }
            System.out.println("\t");
        }
    }
}
