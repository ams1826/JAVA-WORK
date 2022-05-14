// Date 14 may in phone pics
//Tower of HANOI
// Placing the discs from source to destination with the help of helper

import java.util.Scanner;

public class sixth {
    public static void toh(int n , int src , int des , int helper) {
        if(n == 0){
            return;
        }
        toh(n-1 , src , helper , des);
        System.out.println(n + "[" + src + "-->" + des + "]");
        toh(n-1 , helper , des ,src);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int src = scn.nextInt();
        int des = scn.nextInt();
        int helper = scn.nextInt();
        toh(n, src, des, helper);
    }
}