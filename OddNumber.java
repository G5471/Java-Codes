import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any number given range...");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
