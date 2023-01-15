public class ReverseStrin {
    public static void main(String[] args) {
        String str="hello world";
        String reveser=" ";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            reveser=reveser+str.charAt(i);
        }
        System.out.println(reveser);
    }
}
