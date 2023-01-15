public class Armstrong {
    public static void main(String[] args) {
        int num=154,originalNumber,reminder,result=0;
        originalNumber=num;
        while(originalNumber !=0){
            reminder=originalNumber%10;
            result+=Math.pow(reminder, 3);
            originalNumber /=10;
        }
        if(result==num){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }
    }
}
