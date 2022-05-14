import java.util.Scanner;
public class subarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //array 1 
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for(int i=0;i<n1;i++){
           arr1[i]=scn.nextInt();
        }
        // array 2
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }
            
        sub(arr1,arr2);
        
    }
    
    public static void sub(int arr1[] , int arr2[]){
        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = Math.max(l1,l2);
        int res[] = new int[l3];
        int p1=l1-1 , p2=l2-1 , p3=l3-1;
        int carry = 0;
        while(p3>=0){
            int v1 = p1>=0?arr1[p1]:0;
            int digit = 0;
            if(arr2[p2]+carry >= v1){
                digit = arr2[p2] + carry - v1;
                carry = 0;
            }
            else{
                digit = arr2[p2] + carry + 10 - v1;
                carry = -1;
            }
            res[p3] = digit;
            p1--;
            p2--;
            p3--;
        }
        int i=0;
        while(i<res.length){
            if(res[i]==0){
                i++;
            }
            else{
                break;
            }
        }
        while(i<res.length){
            System.out.println(res[i]);
            i++;
        }
    }
}
