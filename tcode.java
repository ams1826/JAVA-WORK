/*

1
23
345
4567
56789

*/

import java.util.Scanner;
public class tcode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        for(int j=1; j<=i; j++){

            if(j==(n+n-1)){
                System.out.print(j);
                break;
            }

            else if(j==i){
                System.out.print(j+"\n");
                i = i + 2;
                j = (i/2);
            }

            else
            System.out.print(j+" ");

        }
    }
}