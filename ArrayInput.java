import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int[] arr = new int[5]; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");

        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("ENTERED NO ARE:");

       
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
