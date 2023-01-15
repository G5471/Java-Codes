import java.util.Scanner;

public class PrintOddBetween1to0 {
    public static void main(String[] args) {
        int n;
        System.out.println("enter number of range...");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
