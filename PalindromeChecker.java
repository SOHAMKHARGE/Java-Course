import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number or string: ");
        String input = sc.nextLine();

        
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

       
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

       
        if (input.equals(reversed)) {
            System.out.println("It's a Palindrome.");
        } else {
            System.out.println("It's Not a Palindrome.");
        }
    }
}

