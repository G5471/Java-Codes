public class MaximumOfThreeNumber {
    public static void main(String[] args) {
        int num1 = 15, num2 = 25, num3 = 13;
        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " ");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " ");

        else
            System.out.println(num3 + " ");
    }
}
