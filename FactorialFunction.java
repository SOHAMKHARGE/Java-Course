public class FactorialFunction {
    public static int factorial(int n) {
        if( n<0){
            return -1;
        }
        if (n==0){
            return 1;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 3;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}

