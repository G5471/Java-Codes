public class FindOddAndEven {
    public static void main(String[] args) {
        int a=1,b=100;
        while(a!=b+1){
            if(a%2==0){
                System.out.println(a+" even number");
            }else{
                System.out.println(a+" odd number");
            }
            a++; 
        }
    }
}
