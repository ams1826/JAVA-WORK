import java.util.*;

public class countVowel {

    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        
        for(char ch : str.toCharArray()){
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    vowelCount++;
                }
            }
        }

        System.out.println("Vowels : " + vowelCount);
        System.out.println("Consonans : " + (str.length() - vowelCount));
    }


    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            String str = scn.next();
            countVowelsAndConsonants(str);
        }
        catch(Exception e){
            System.out.println("Error occured " + e.getMessage());
            e.printStackTrace();
        }
    }
}
