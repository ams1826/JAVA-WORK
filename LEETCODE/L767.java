package LEETCODE;

import java.util.*;
public class L767 {

    public static String reorganizeString(String str) {
        StringBuilder result = new StringBuilder(str);
        int first = 0;
        int second = 1;
        int third = 2;
        if(result.length()<=2){
            return result.toString();
        }
        else if(result.length()==3){
            System.out.println("nothing");
        }
        while(second != result.length()-1){
            if(result.charAt(first)==result.charAt(second)){
                if(result.charAt(second)!=result.charAt(third)){
                    char temp = result.charAt(second);
                    result.setCharAt(second, result.charAt(third));
                    result.setCharAt(third, temp);
                }
                else{
                    third++;
                }
            }
            else{
                first++;
                second++;
                third = second + 1;
            }
        }
        return result.toString();
    }




    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            String str = scn.next();
            System.out.println(reorganizeString(str));
        }
        catch(Exception e){
            System.out.println("Error occured " + e.getMessage());
            e.printStackTrace();
        }
    }
}
