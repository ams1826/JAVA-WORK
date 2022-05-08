import java.util.*;
public class fourth {
    public static int power(int n , int p){
        if(p==0){
            return 1;
        }
        int po = power(n , p-1);
        int m = n * po;
        return m;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        int ans = power(n,p);
        System.out.print(ans);
    }
}
