//upcasting
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Child class
public class upcasting extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a kick");
    }
    
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start(); 
        
        upcasting b = new upcasting();
        b.start(); 
        
        Vehicle v2 = new upcasting(); 
        v2.start();
    }
}
