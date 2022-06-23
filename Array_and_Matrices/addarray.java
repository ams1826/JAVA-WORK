import java.util.Scanner;
public class addarray {
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
        
        int res[] = add(arr1,arr2);
        for(int val:res){
            System.out.println(val);
        }
    }

    public static int[] add(int arr1[], int arr2[]){
        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = Math.max(l1,l2);
        int res[] = new int[l3];
        int p1=l1-1 , p2=l2-1 , p3=l3-1 , carry=0;
        
        while(p1>=0 || p2>=0){
            int v1 = p1>=0?arr1[p1]:0;
            int v2 = p2>=0?arr2[p2]:0;
            int sum = v1 + v2 + carry;
            int digit = sum%10;
            carry = sum/10;
            res[p3] = digit;
            p1--;
            p2--;
            p3--;
        }
        if(carry!=0){
            int newres[] = new int[l3+1];
            newres[0] = carry;
            for(int i=1 ; i<newres.length ; i++){
                newres[i] = res[i-1];
            }
            return newres;
        }
        return res;
    }
}



/*
    1. this keyword reffers to the current object
    inside a method or cunstructor
    2. whenever the name of instance variable and
    local variable both are same then our runtime
    environment JVM gets confused that which one
    is local variable and which one is instance variable
    3. it is also used when we want to call the default
    constructor of it's own class
    4. it is also used to call parametrized constructor
    of it's own class
 

*/