public class palindromeString {
    public static void main(String[] args) {
        String str="arora";
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String data=buffer.toString();
        if(str.equals(data)){
            System.out.println("palindrome string");
        }else{
            System.out.println("not a palindrome string");
        }
    }
}
