public class thiskeyword {
    String name;
    int age;

    public thiskeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        thiskeyword s1 = new thiskeyword("Soham", 20);
        System.out.println(s1.name);
        System.out.println( s1.age);
    }
}