
public class StringEx {
    public static void main(String arg[]) {
        // Scanner sc = new Scanner(System.in);
        String name = "soham";
        String lastname = "kharge";
        String fullname = name.concat(lastname);
        System.out.println(fullname);

        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

        int result = name.compareTo(lastname);
        if (result == 0){
            System.out.println("String is match");
        }
        else{
            System.out.println("String is not match");
        }

        String subname = fullname.substring(2, 9);
        System.out.println(subname);
        

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(2));
        
        sb.append(" Stark");
        System.out.println(sb);

        sb.setCharAt(0,'S');
        System.out.println(sb);

        for(int i = 0; i< sb.length()/2; i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }        
        System.out.println(sb);
        
    }

}
