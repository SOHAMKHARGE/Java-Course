public class parametrizedconstructor{
    
    private String name;
    private int age;

       public parametrizedconstructor(String sName, int sAge) {
        name = sName;
        age = sAge;
    }

        public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

   
    public static void main(String[] args) {
       
        parametrizedconstructor s1 = new parametrizedconstructor("Soham", 20);
        s1.display();
    }
}
