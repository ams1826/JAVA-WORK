/*

binary print in 8 bit form

*/

import java.util.*;
public class tcode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int n = N;
        int bit = 0;
        int i = 0;
        while(n!=0){
            int r = n%2;
            bit = bit + ((int)Math.pow(10,i)*r);
            i++;
            n = n/2;
        }
        System.out.println(bit);
    }
}