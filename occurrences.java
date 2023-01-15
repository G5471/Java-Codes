import java.util.Scanner;

public class occurrences {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=i;j>0;j=j/10){
                if((j%10)==2){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
