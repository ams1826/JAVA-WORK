//Rotating an array by value K
/*
        I/P :   array--> 1 2 3 4 5
                K --> 2
        O/P : 4 5 1 2 3

    For +ve value of K -->Last digit will come at first place and the process will repeat till the value of K
    For -ve value of K -->First digit will go at last place and the process will repeat till the value of K
*/

import java.util.Scanner;
public class rotatearray {
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
           arr[i]=scn.nextInt();
       }
       int k = scn.nextInt();

       int res[] = rotate(arr,k);
       for(int val:res){
           System.out.println(val);
       }
 
   } 

   //function for reverse
   public static int[] reverse(int arr[],int low , int high){
       //Swap 
       while(low<high){
           int temp = arr[low];
           arr[low]= arr[high];
           arr[high] = temp;
           
           low++;
           high--;
        }
        return arr;
   }

   public static int[] rotate(int arr[],int k ){
       //Find true roation 
       int count = arr.length;
       k = k%count;
       if(k<0){
           k = k+count;
       }

       //1
       reverse(arr,count-k,count-1);

       //2
       reverse(arr,0,count-k-1);

       //3
       reverse(arr,0,count-1);

       return arr;

   } 
   

   
}