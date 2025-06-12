public class main12 {
    public static void main(String[] args) {
        poly p1 =new poly();
        p1.show();
        
    }
    
}
class parent {
    void show(){
        System.out.println("this is parent class method");
        
    }
    
}
class poly extends main12{
    void show(){
        
        System.out.println("this is child class method");
    }
}