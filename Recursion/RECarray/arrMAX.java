//Finding minimum value in array using recursion


package Recursion.RECarray;
import java.util.*;
public class arrMAX {

//Finding maximum element
    public static int arrMAX(int arr[] , int idx) {
        if(arr.length == idx){
            return Integer.MIN_VALUE;
        }
        int res = arrMAX(arr , idx+1);
        if(res > arr[idx]){
            return res;
        }
        else{
            return arr[idx];
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
//array input
        for(int i=0;i<n;i++){
           arr[i]=scn.nextInt();
        }
        int ans = arrMAX(arr , 0);
        System.out.println(ans);
    }
}
