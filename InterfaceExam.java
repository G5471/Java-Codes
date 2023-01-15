interface InterfaceExam {
    void disp1();
}

class A implements InterfaceExam {
    public void disp() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.disp();
    }
}