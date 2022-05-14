import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();
        
        int res[] = swap(arr);
        
        for(int val:res){
            System.out.println(val);
        }
    }

    public static int[] swap(int arr[]) {
        int low = 0;
        int high = arr.length-1;

        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
}
