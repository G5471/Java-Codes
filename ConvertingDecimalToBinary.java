public class ConvertingDecimalToBinary {
    public static void main(String[] args) {
        int num=14;
        int temp;
        temp=num;
        String binary=" ";
        while(num>2){
            binary=num%2+binary;
            num=num/2;
        }
        binary=num+binary;
        System.out.println(temp+" "+binary);
    }
}
