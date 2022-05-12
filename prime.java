//Fint if the number is prime or not

import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int count = 0;
        for(int i=2; i*i<a ;i++){
            if(a%i==0){
                count = 1;
                break;
            }
        }if(count == 0){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
