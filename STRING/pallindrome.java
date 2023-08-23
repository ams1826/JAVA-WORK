import java.util.Scanner;
public class pallindrome {

    public static boolean isPallindrome(String str) {
        StringBuilder result = new StringBuilder(str);
        int n = result.length();
        int i = 0;
        while(i<n/2){
            if(result.charAt(i) != result.charAt(n-i-1)){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            String str = scn.next();
            if(isPallindrome(str)){
                System.out.println("Is Pallindrome");
            }
            else{
                System.out.println("Is Not Pallindrome");
            }
            
        }
        catch(Exception e1){
            System.out.println("Error occured");
        }
    }
}
