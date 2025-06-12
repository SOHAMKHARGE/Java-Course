class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person(p1); 

        System.out.println(p2.name);
        System.out.println(p2.age);  
    }
}
    

