//Exit point of array

import java.util.Scanner;
public class exitarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=4;
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int r=0 , c=0 , dir=0;
        while(r>=0 && r<n && c>=0 && c<n){
            dir=(dir + arr[r][c])%4;
        //east
            if(dir==0){
                c++;
            }
        //south
            else if(dir==1){
                r++;
            }
        //west
            else if(dir==2){
                c--;
            }
        //north
            else if(dir==3){
                r--;
            }
        }
//for printing the indexes we need to subtract the desired row or column form the indexes comming after the while loop
//as the index is 1 greater than the actual answer
    //east
        if(dir==0){
            c--;
        }
    //south
        else if(dir==1){
            r--;
        }
    //west
        else if(dir==2){
            c++;
        }
    //north
        else if(dir==3){
            r++;
        }

        System.out.println("r= "+r);
        System.out.println("c= "+c);
    }
}
