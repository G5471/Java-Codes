abstract class Animal {
    public abstract void animalSound();

    public void sound() {
        System.out.println("zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("the pig say wee wee");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Pig A = new Pig();
        A.sound();
        A.animalSound();
    }
}
