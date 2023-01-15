public class ReverseNumber {
    public static void main(String[] args) {
        int num=123456789,n=0,reverse=0;
        while(num>0){
            n=num%10;
            reverse=reverse*10+n;
            num=num/10;
        }
        System.out.println(num+" "+reverse);
    }
}
