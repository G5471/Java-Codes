interface A{
    void print();
}
class A6 implements A{
    public void print(){
        System.out.println("hello");
    }
}
public class printable{
    public static void main(String[] args) {
        A6 obj=new A6();
        obj.print();
    }
}