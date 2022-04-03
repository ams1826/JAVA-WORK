import java.util.Scanner;
public class primefactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
//if we use i*i then only print half prime factors 512 = 1 2 4 8 16.......
//whereas other factors are 32 64 128 256 512 which are not printing
        for(int i=2; i*i<=a; i++){
            while(a%i==0){
                System.out.print(i+" ");
                a = a/i; 
            }
        }
        if(a!=1){
            System.out.println(a);
        }
    }
}
