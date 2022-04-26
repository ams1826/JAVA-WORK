//Printing number patter 1

import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){
                count++;
                System.out.print(count+"\t");
            }
            System.out.println();
        }
    }
}


/*

1
2 3
4 5 6
7 8 9 10

*/