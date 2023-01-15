import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        char ch;
        System.out.println("please enter character...");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(2);
        System.out.println(ch);
    }
}
