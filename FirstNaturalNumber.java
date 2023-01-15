import java.util.Scanner;

public class FirstNaturalNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("enter number of term...");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
