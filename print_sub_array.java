import java.util.Scanner;
public class print_sub_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int r=0; r<n; r++){
            int ele = scn.nextInt();
            arr[r] = ele;
        }
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]);
                }
                System.out.print("\n");
            }
        }
    }
}



//print
/*
10
10 20
10 20 30
20
20 30
30
*/