import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("enter any number...");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0){
            for(int i=1;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println(sum);
        }else{
            for(int i=0;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println(sum);
        }
    }
}
