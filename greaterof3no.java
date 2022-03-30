import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class greaterof3no {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if(a>b){
            if(a>c){
                //a
            }else{
                //c
            }
        }else{
            if(b>c){
                //b
            }else{
                //c
            }
        }    
    }
}
