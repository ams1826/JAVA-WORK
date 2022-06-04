package Recursion.RECarray;

import java.util.*;
public class lastIDX {

    public static int last(int arr[] , int idx , int a) {
        if(arr.length < 0){
            return -1;
        }
        if(arr[idx] == a){
            return idx;
        }
        return last(arr, idx-1 , a);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
//array input
        for(int i=0;i<n;i++){
           arr[i]=scn.nextInt();
        }
 //nummber to search
        System.out.print("Enter value to search");
        int a = scn.nextInt();
//calling the function
        int ans = last(arr , arr.length-1 , a);
        System.out.println(ans);
    }
}