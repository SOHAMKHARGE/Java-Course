public class overloading {

    
    int add(int a, int b) {
        return a + b;
    }

   
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
         overloading o = new overloading();

        System.out.println("Sum of 2 ints: " + o.add(10, 20));           
        System.out.println("Sum of 3 ints: " + o.add(5, 10, 15));        
              
    }
}
