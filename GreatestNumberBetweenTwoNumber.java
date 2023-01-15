import java.util.Scanner;

public class GreatestNumberBetweenTwoNumber {
    public static void main(String[] args) {
        int a, b;
        System.out.println("enter any number...");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
