//Position * (10^[digit-1])   ---->  position * (int)Math.pow(10,digit-1)

import java.util.Scanner;
public class inverseposition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int sum = 0;
        int count = 0;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        int p = 1;
        while(p<=count){
            int d = n%10;
            int x = p*(int)Math.pow(10,d-1);
            sum = sum + x;
            n = n/10;
            p++;
        }System.out.println(sum);
    }
}
