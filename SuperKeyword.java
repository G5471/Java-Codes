class A {
    String colour = "white";
}

class Dog extends A {
    String colour = "black";

    void printcolour() {
        System.out.println(colour);
        System.out.println(super.colour);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printcolour();
    }
}
