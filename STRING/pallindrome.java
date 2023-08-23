import java.util.Scanner;
public class pallindrome {

    public static boolean isPallindrome(String str) {
        StringBuilder result = new StringBuilder(str);
        int left = 0;
        int right = result.length();
        while(left < right){
            if(result.charAt(left) != result.charAt(right)){
                return false;
            }
            left++;
            right--;
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
        catch(Exception e){
            System.out.println("Error occured " + e.getMessage());
            e.printStackTrace();
        }
    }
}
