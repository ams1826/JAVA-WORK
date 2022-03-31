import java.util.Scanner;
public class primefactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
//if we use i*i then only print half prime factors 512 = 1 2 4 8 16.......
//whereas other factors are 32 64 128 256 512 which are not printing
        for(int i=1; i<=a; i++){
            if(a%i==0){
                System.out.print(i+" ");
            }
        }
        if(a==1){
            System.out.println("it is not prime");
        }
        else{
            System.out.println("it is prime");
        }
    }
}
