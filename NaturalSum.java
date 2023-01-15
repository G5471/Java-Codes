import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        int n, sum=0;
        System.out.println("enter any number....");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
