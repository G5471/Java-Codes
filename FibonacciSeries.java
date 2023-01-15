public class FibonacciSeries {
    public static void main(String[] args) {
        int n=9,b=0,c=1;
        int temp=0;
        for(int i=0;i<=n;i++){
            System.out.println(b+" ");
            temp=b+c;
            b=c;
            c=temp;
        }
    }
}
