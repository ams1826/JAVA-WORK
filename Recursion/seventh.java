//Print Zig Zag
import java.util.Scanner;
public class seventh {
    public static void printZigZag(int n) {
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printZigZag(n-1);
        System.out.print(n + " ");
        printZigZag(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printZigZag(n);
    }
}
