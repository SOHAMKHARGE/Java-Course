class car {
    public void drive(){
        System.out.println("car is running on highway");
        
    }
    
}    


public class inheritance extends car {
    public static void main(String [] args){
        inheritance c1=new inheritance();
        c1.display();
        car c=new car();
        c.drive();


    }
    void display(){
        System.out.println("thse is base class");
         

    }
}