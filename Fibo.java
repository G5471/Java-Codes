import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int a , b=0,c=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        a=sc.nextInt();
        for(int i=0;i<=a;i++){
            System.out.println(b+" ");
            int l =b+c;
            b=c;
            c=l;
        }
    }
}
