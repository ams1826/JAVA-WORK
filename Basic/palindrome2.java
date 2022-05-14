/*Checking that the numbwe is palindrome or not
   Methid 2:- Reversing the whole number and then comparing it
              to cheack it is palindrome or not.
*/

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
