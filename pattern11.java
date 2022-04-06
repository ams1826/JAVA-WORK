import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r= 1 , spaces = 1 , stars = (n/2)+1;
        while(r<=n){
        //stars
            for(int i=1; i<=stars; i++){
                System.out.print("*");
            }
        //spaces
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
        //stars
            for(int i=1; i<=stars; i++){
                System.out.print("*");
            }
            System.out.println();
        //increase and decrease in stars and spaces
            if(r<=n/2){
                stars--;
                spaces+=2;
            }
            else{
                stars++;
                spaces-=2;
            }
            r++;
        }
    }
}

/*
*** ***
**   **
*     *
**   **
*** ***
*/