//Create and print array in a loop up to down down to up up to down

import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r=3 , c=3;
        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<r; i++){
            if(i%2==0){
                for(int j=0; j<c; j++){
                    System.out.println(arr[j][i]);
                }
            }
            else{
                for(int j=r-1; j>=0; j--){
                    System.out.println(arr[j][i]);
                }
            }
        }
    }
}

/*
arr = 1 2 3
      4 5 6
      7 8 9

o/p= --1
       4
       7
     --8
       5
       2
     --3
       6
       9
*/