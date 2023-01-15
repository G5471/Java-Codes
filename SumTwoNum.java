import java.util.Scanner;

public class SumTwoNum {
    public static void main(String[] args) {
        int a,b,sum=0;
        System.out.println("enter any number....");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Addition of two number...."+sum);
    }
}
