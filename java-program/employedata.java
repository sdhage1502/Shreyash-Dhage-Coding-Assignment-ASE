    import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static boolean isAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] chararr1 = str1.toCharArray();
        char[] chararr2 = str2.toCharArray();
        
        Arrays.sort(chararr1);
        Arrays.sort(chararr2);
        
        return Arrays.equals(chararr1, chararr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase();
        //  String str1 = "listen";
        // String str2 = "silent"; 


        if (isAnagrams(str1, str2)) {
            System.out.println("IS ANAGRAM");
        } else {
            System.out.println("IS NOT ANAGRAM");
        }
        
        scanner.close();
    }
}
