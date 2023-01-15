import java.util.Scanner;

public class Range {
    static int count_2s(int n){
        int count=0;
        while(n>0){
            if(n%10==2){
                count++;
            }
            n=n%10;
        }
        return count;
    }
    static int count_in_range(int n){
        int count=0;
        for(int i=0;i<=n;i++){
            count += count_2s(i);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int number=sc.nextInt();
        System.out.println(count_in_range(number));
    }
}
