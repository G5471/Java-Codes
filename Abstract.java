abstract class Animal{
    public abstract void sound();
}
class dog extends Animal{
    public void sound(){
        System.out.println("Dog is barking");
    }
}
public class Abstract {
    public static void main(String[] args) {
        dog D=new dog();
        D.sound();
    }
}
