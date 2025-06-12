class Student {
    private String name;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class encapsulation {
    public static void main(String arg[]){
        Student s1 = new Student();
        s1.setName("soham");
        System.out.println("Name is:"+s1.getName());
    
}
}