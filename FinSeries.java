import java.util.Scanner;

import javax.lang.model.SourceVersion;

public class FinSeries {
    public static void main(String[] args) {
        int b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.println(b + " ");
            int l = b + c;
            b = c;
            c = l;
        }

    }
}
