import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int num,power,result=1;
        System.out.println("Enter any number...");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("enter power...");
        power=sc.nextInt();
        for(int i=1;i<=power;i++){
            result=num*result;
        }
        System.out.println(result);
    }
}
