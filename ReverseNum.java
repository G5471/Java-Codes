public class ReverseNum {
    public static void main(String[] args) {
        int num=123456789;
        int reverse=0;
        while(num !=0){
            int A=num%10;
            reverse=reverse*10+A;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
