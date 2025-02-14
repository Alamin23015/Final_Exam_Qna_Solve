import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        boolean check = true;
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                check = false;
                break;
            }
        }

        if (check) 
            System.out.println("Palindrome");
        else 
            System.out.println("Not Palindrome");

        sc.close();
    }
}
