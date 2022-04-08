/*Taking array and searching the element in it and print it's index and
  if the element is not present then print the rang in where that element comes.
         example :- A[5] = [1 , 3 , 6 , 7 , 10]
                    search = 1 _______ present at index 0
                    search = 4 _______ element not present .'. print the range i.e. number present b/t 3 to 6
*/
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
        int found = 0;
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
                found = 1;
                break;
            }
        }
        if(found==0){
            System.out.print(a+" "+b);
        }
    }
}