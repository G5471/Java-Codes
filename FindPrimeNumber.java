import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int n, n2, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        n = sc.nextInt();
        n2 = sc.nextInt();
        for (i = n; i < n2; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.println(j);
        }
    }
}