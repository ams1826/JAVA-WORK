//Printing matrix in pattern

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
public class matrix2Dwakanda {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
    //Taking input
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    
    //Print
        for(int gap=0; gap<n; gap++){
            for(int i=0; i<n-gap; i++){
                int j = i + gap;
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

    }
}


/*



*/