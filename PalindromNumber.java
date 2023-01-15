public class PalindromNumber {
    public static void main(String[] args) {
        int num=3553,reverseNum=0,reminder;
        int originalNum=num;
        while(num>0){
            reminder=num%10;
            reverseNum=reverseNum*10+reminder;
            num /= 10;
        }
        if(originalNum==reverseNum){
            System.out.println("palindrome number");
        }else{
            System.out.println("not palindrome number");
        }
    }
}
