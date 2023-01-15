import java.util.Scanner;

public class SumOfDigit2 {
    public static void main(String[] args) {
        int sum=0;
        int nsum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        num=sc.nextInt();
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
}
