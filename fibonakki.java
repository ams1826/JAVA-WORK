// Printing fibonakki series i.e. starting from 0 and 1 then adding previous element and printing them
// 0  1  1  2  3  5  8  13  21  34...........

import java.util.Scanner;
public class fibonakki {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int first = 0;
        int second = 1;
        for(int i=0; i<a; i++){
            int third = first + second;
            System.out.print(first+"\t");
            first = second;
            second = third;
        }
    }
}
