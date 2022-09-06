/*

binary print in 8 bit form

*/

import java.util.Scanner;
public class tcode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        for(int j=1; j<=i; j++){

                //base condition________________________
            if(j==(n+n-1)){
                System.out.print(j);
                break;
            }

                //when ele in row ends__________________
            else if(j==i){
                System.out.print(j+"\n");
                i = i + 2;
                j = (i/2);
            }

                //print ele of row______________________
            else
            System.out.print(j+" ");

        }
    }
}