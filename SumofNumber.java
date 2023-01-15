//Find the Sum of the Digits of a Number in Java Language
public class SumofNumber {
    public static void main(String[] args) {
        int num=15468;
        int sum=0;
        int digit;
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
    }
}
