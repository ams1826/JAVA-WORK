import java.util.Scanner;
public class tcode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r= 1 , spaces = n/2 , stars = 1;
        while(r<=n){
        //spaces
            for(int i=1; i<=spaces; i++){
                System.out.print(" ");
            }
        //stars
            for(int j=1; j<=stars; j++){
                if((r+j)%2!=0 || r==j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            if(r<=n/2){
                spaces--;
                stars+=2;
            }
            else{
                spaces++;
                stars-=2;
            }
            r++;
        }
    }
}
