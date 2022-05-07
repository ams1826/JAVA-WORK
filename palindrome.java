/* Checking that the numbwe is palindrome or not
   Methid 1:- Spliting number in 2 parts
              Them reversing the 2nd part and comparing with 1st half
                exaample:- 1234321
                           1st half = 123
                           2nd half = 321
                           reversing 2nd half = 123
                           comparing 1st half reversed 2nd half and cheacking
                           if the number is palindrome or not
                
            cfcvbv k vj v jgiyugiyi  jhbjg
            liygvuyv jhbjhb hjv uf yg l yg
            l  vlljhhv jlhbhlvb ljhb li glig
            ihh glv jhv b hb hjlb ,g,ig iglg i g
            luv jlhv ljjv j,hv ,jhg ,jgh ,jg ilg lg
            k fkjfkh fkllf ulfufufuyf ,jfukyf uyfkuyfu k
            uygfgu jv jhhjhvjhvyfg uyuyffkllglyufgulyff
            'uyf uyfluf v jf jgk,uy gy
*/

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int temp = a;
        int count = 0;
        int y , ans = 0;
//counting number of elements        
        while(temp!=0){
            count++;
            temp = temp/10;
        }
        int n = count/2;
//taking out starting elements to compare with last elements
        if(count%2==0)
        {
            y = a/(int)Math.pow(10,n);
        }
        else{
            y = a/(int)Math.pow(10,n+1);
        }
//taking out last elements and swapping em
        int x = a%(int)Math.pow(10,n);
        while(x!=0){
            int z = x%10;
            ans = ans*10 + z;
            x = x/10;
        }
//final result
        if(ans == y){
            System.out.print("it is a palindrome");
        }else{
            System.out.print("it is not a palindrome");
        }
    }
}
