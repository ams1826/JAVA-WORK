/*changing position of the numbers according to index
FORMULA-->[Position * (10^[digit-1])   ---->  position * (int)Math.pow(10,digit-1)]
            I/P:-   5 2 1 3 4
  their indexes:-   5 4 3 2 1   INDEX(to number)     NUMBER(to index)
            O/P:-   5 1 2 4 3 { number 1 is placed at index 4
                                number 2 is placed at index 3
                                number 3 is placed at index 1
                                number 4 is placed at index 2
                                number 5 is placed at index 5
                                    }
*/

import java.util.Scanner;
public class inverseposition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int sum = 0;
        int count = 0;
        while(temp!=0){
            temp = temp/10;
            count++;
            // System.out.println(temp+"__"+count);
        }
        int p = 1;
        while(p<=count){
            int d = n%10;
            int x = p*(int)Math.pow(10,d-1);
            sum = sum + x;
            n = n/10;
            p++;
        }System.out.println(sum);
    }
}
