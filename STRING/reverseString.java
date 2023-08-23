import java.util.*;
public class reverseString{

    public static String reverse(String str){
        StringBuilder reversed = new StringBuilder(str);
        int left = 0;
        int right = reversed.length()-1;
        while(left<right){
            char temp = reversed.charAt(left);
            reversed.setCharAt(left, reversed.charAt(right));
            reversed.setCharAt(right, temp);

            left++;
            right--;
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "AKASH";
        System.out.println(reverse(str));
        
    }
}