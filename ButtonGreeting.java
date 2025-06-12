import java.util.Scanner;

public class ButtonGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter button number (1 to 4): ");
        int B = sc.nextInt();

        if (B == 1) {
            System.out.println("Hello");
        } else if (B == 2) {
            System.out.println("Namaste");
        } else if (B == 3) {
            System.out.println("Good Morning");
        } else if (B == 4) {
            System.out.println("Bonjour!");
        } else {
            System.out.println("Invalid button.");
        }

        sc.close();
    }
}
