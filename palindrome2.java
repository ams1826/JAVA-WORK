import java.util.Scanner;
public class palindrome2 {
    public static void main(String[] args) {
        Scanner scn = new  Scanner(System.in);
        int a = scn.nextInt();
        int n = a;
        int ans = 0;
        while(n>0){
            ans = ans*10 + n%10;
            n = n/10;
        }
        if(ans==a){
            System.out.print("palindrome");
        }else{
            System.out.print("not a palindrome");
        }
    }
}
