public class demo {
    public static void main(String[] args) {
        String firstName = "Soham";
        String lastName = "Kharge";
        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);

       
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        if (firstName.equals(lastName)) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are not the same");
        }
    }
}
