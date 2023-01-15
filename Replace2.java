import java.util.Scanner;

public class Replace2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String str = Integer.toString(number);
        int len = str.length();
        String str2 = "";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '6')
                str2 = str2 + '1';
            else
                str2 = str2 + str.charAt(i);
        }
        System.out.println(str2);
    }
}
