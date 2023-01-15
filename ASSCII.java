import java.util.Scanner;

public class ASSCII {
    public static void main(String[] args) {
        char ch;
        System.out.println("enter any character...");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int a=ch;
        System.out.println(ch+" "+a);
    }
}
