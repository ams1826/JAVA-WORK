/*  n = 12345
    k = 2
    o/p --> 45123
            ''<--position change
*/

import java.util.Scanner;
public class rotateno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        int temp = a;
        int count = 0;
        while(temp!=0){
            
            temp = temp/10;
            count++;
        }
        int k = n%count;
        if(k<0){
            k = count + k;
        }
        int p1 = (int)Math.pow(10,k);
        int last = a%p1;
        int first = a/p1;
        int p2 = (int)Math.pow(10,count-k);
        int ans = (last*p2) + first;
        System.out.println(ans);
    }
}
