import java.util.Scanner;

public class FindPrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        String str=" ";
        System.out.println("enter number..");
        num=sc.nextInt();
        for(int i=0;i<num;i++){
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
