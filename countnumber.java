
import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int count=0;
        if(num==0){
            count=1;
        }else{
            while(num!=0){
                num=num/10;
                count++;
            }
        }
        System.out.println("count is "+count);
    }
    
}
