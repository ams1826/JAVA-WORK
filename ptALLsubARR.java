import java.util.Scanner;
public class ptALLsubARR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    //array input 
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
           arr[i]=scn.nextInt();
        }
        System.out.println();

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
            for(int j=i+1; j<n; j++){
                System.out.print(arr[i]);
                System.out.println(arr[j]);
                for(int k=j+1; k<n; k++){
                    System.out.print(arr[i]);
                    System.out.print(arr[j]);
                    System.out.println(arr[k]);
                }
            }
        }
    }
}
