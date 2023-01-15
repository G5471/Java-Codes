import java.util.Scanner;

interface client {
    void input();

    void output();
}

public class InterfaceExample implements client {
    String name;
    double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user_name");
        name = sc.nextLine();
        System.out.println("enter salary");
        salary = sc.nextDouble();
    }

    public void output() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        client sc = new InterfaceExample();
        sc.input();
        sc.output();
    }
}
