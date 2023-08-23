import java.util.Scanner;
public class pallindrome {

    

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            String str = scn.next();

            System.out.println(str);
        }
        catch(Exception e1){
            System.out.println("Error occured");
        }
    }
}
