import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) {
/*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 2;
        int count = 1;
        while(i*i<n){
            i++;
            if(i*i>n){
                System.out.println(i-1);
                count = 0;
            }
        }
        if(count==1){
            System.out.print(i);
        }
  */
  int i=0;
  while(i*i<=2147395600)
 {
     i++;
 }
  System.out.println(i);
            
    }
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     double a = scn.nextInt();
    //     double x = Math.sqrt(a);
    //     int z = (int)Math.round(x);
    //     if(z>x){
    //         System.out.print(z-1);
    //     }else{
    //         System.out.print(z);
    //     }
    // }
}