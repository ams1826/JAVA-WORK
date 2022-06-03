//Print square root or the nearest square root of a number

import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
  int i=0;
  while(i*i<n)
 {
     i++;
 }
  System.out.println(i);
            
    }
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     double a = scn.nextInt();
    //     double x = Math.sqrt(a);
}




/*
binary search
pooint start on  0 and end on n/2
start search by squaring the number
*/