import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int temp = a;
        int count = 0;
        int y , ans = 0;
//counting number of elements        
        while(temp!=0){
            count++;
            temp = temp/10;
        }
        int n = count/2;
//taking out starting elements to compare with last elements
        if(count%2==0)
        {
            y = a/(int)Math.pow(10,n);
        }
        else{
            y = a/(int)Math.pow(10,n+1);
        }
//taking out last elements and swapping em
        int x = a%(int)Math.pow(10,n);
        while(x!=0){
            int z = x%10;
            ans = ans*10 + z;
            x = x/10;
        }
//final result
        if(ans == y){
            System.out.print("it is a palindrome");
        }else{
            System.out.print("it is not a palindrome");
        }
    }
}
