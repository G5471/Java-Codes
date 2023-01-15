import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("enter number given range....");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
