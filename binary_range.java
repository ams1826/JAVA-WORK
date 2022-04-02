//a[]=
import java.util.Scanner;
public class binary_range {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//taking array elements       
        int arr[] = new int[n];
        for(int r=0; r<n; r++){
            int ele = scn.nextInt();
            arr[r] = ele;
        }
//setting range
        int low = 0;
        int high = arr.length-1;
        int a = 0, b = 0;
//value to search
        int k = scn.nextInt();
//applying binary search
        while(low<=high){
            int mid = low+((high-low)/2);
            if(arr[mid]>k){
                high = mid - 1;
                b = arr[mid];
            }
            else if(arr[mid]<k){
                low = mid + 1;
                a = arr[mid];
            }
            else{
                System.out.print(mid);
            }
        }
        System.out.print(a+" "+b);
    }
}