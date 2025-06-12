import java.util.Scanner;

public class function {
    
    // Function to print the number
    public static void printNumber(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        
        printNumber(input);
    }
}
