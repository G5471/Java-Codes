public class main3 {
    static int start=2;
    final int end;
    public main3 (int x){
        x=4;
        end=x;
    }
    public void fly(int distance){
        System.out.println(end-start+" ");
        System.out.println(distance);
    }
    public static void main(String[] args) {
        new main3(10).fly(5);
    }
}
