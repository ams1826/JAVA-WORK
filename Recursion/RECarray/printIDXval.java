//Printing values of array from index 0 to n-1 and n-1 to 0 using recursion

package Recursion.RECarray;
import java.util.*;
public class printIDXval {

//From 0 to n-1
    public static void printSTART(int arr[] , int idx) {
        if(arr.length == idx){
            return;
        }
        System.out.println(arr[idx]);
        printSTART(arr, idx+1);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
//array input
        for(int i=0;i<n;i++){
           arr[i]=scn.nextInt();
        }
        System.out.println("Printing values from 0 to n-1");
        printSTART(arr, 0);
    }
}
