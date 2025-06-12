class Person {
    public static void main(String[] args) {
        Constructor s1 = new Constructor();
        s1.name = "John";  
        s1.age = 20;
        s1.display();
    }
}
public class Constructor{ 
    String name;
    int age;

    public Constructor() {
        System.err.println("constructor called");
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}