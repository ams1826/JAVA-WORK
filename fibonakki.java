import java.util.Scanner;
public class fibonakki {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int first = 0;
        int second = 1;
        for(int i=0; i<a; i++){
            int third = first + second;
            System.out.print(first+"\t");
            first = second;
            second = third;
        }
    }
}
