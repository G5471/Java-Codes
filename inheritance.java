class employee{
    float salary=4000;
}
class A extends employee{
    int bonus=10000;
}
public class inheritance {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.salary);
        System.out.println(obj.bonus);
    }
}
