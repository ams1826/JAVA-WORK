//Finding smallest in a row and greatest in column

import java.util.Scanner;
public class saddlePrice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = scn.nextInt();
            }
        }

    //main logic 
        for(int r=0; r<mat.length; r++){
            int ele = mat[r][0];
            int ci = 0;
            for(int c=0; c<mat[0].length; c++){
                if(mat[r][c]<ele){
                    ele = mat[r][c];
                    ci = c;
                }
                boolean ans = check(mat,ele,ci);
                if(ans == true){
                    System.out.println(ele);
                    return;
                }
            }
        }
        System.out.println("invalid");

    }
    public static boolean check(int mat[][],int ele,int ci){
        for(int r=0;r<mat.length;r++){
            if(mat[r][ci]>ele){
                return false;
            }
        }
        return true;
    }
}


/*
1 2 3
4 5 6
7 8 9

print 7 as it is smallest in row
but is greatest in row
*/