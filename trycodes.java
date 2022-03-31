import java.util.Scanner;
public class trycodes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        int n = scn.nextInt();
        double a = (double)Math.pow(x,n);
        System.out.println(a);
    }
}
