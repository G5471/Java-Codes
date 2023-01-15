import java.util.Scanner;

public class SumOfOddEvenArray {
    public static void main(String[] args) {
        int n, sum = 0, sum2 = 0;
        System.out.println("enter any Array...");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element of the Array...");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) { 
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            } else {
                sum2 = sum2 + arr[i];
            }
        }
        System.out.println("Sum even... " + sum);
        System.out.println(" sum of odd..." + sum2);

    }
}
