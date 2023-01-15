//Program to display the prime numbers from 1 to 100
import java.util.Scanner;
public class find_0to_N {
    public static void main(String[] args) {
        int num=0;
        String str=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num=sc.nextInt();
        for(int i=0;i<=num;i++){
            int count=0;
            for(int j=i;j>=1;j--){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                str=str+i+" ";
            }
        }
        System.out.println(str);
    }
}
