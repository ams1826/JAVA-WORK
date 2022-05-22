

package Recursion.RECarray;
import java.util.*;
public class firstIDX {

//Finding maximum element
    public static int first(int arr[] , int idx , int a) {
        if(arr.length == idx){
            return -1;
        }
        if(arr[idx] == a){
            return idx;
        }
        return first(arr, idx+1 , a);
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
        int ans = first(arr , 0 , a);
        System.out.println(ans);
    }
}

