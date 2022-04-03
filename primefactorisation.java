import java.util.Scanner;
public class primefactorisation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
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
