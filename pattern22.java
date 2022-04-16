
import java.util.Scanner;
public class pattern22 {
    public static int fac(int n) {
        int v=1;
        for(int i=2; i<=n; i++){
            v = v*i;
        }return v;
    }

    public static int com(int i , int j) {
        int n = fac(i);
        int r = fac(j);
        int dif = i-j;
        int nr = fac(dif);
        
        int ans = n / (r*nr);
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                int ncr = com(i , j);
                System.out.print(ncr);
            }
            System.out.println();
        }
    }
}


/*

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

*/