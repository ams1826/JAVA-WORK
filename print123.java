import java.util.Scanner;
public class print123 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int tmp = 1;
        int temp = n;
        while(temp>9){
            tmp = tmp*10;
            temp = temp/10;
        }
        while(tmp!=0){
            int x = n/tmp;
            System.out.println(x);
            n = n%tmp;
            tmp = tmp/10;
        }
    }
}
