//Printing number patter 2

import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0;
        int second = 1;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){
                int third = first+second;
                System.out.print(first+"\t");
                first = second;
                second = third;
            }
            System.out.println("\t");
        }
    }
}

/*

0
1  1
2  3   5
8  13  21  34

*/