import java.util.Scanner;
public class permulation {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.next();
        permulation(str, " ");
    }

    public static void permulation(String A, String B) {
        if (A.length() == 0) {
            System.out.println(B);
            return;
        }
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            String Apart = A.substring(0, i);
            String Bpart = A.substring(i + 1);
            String Rpart = Apart + Bpart;
            permulation(Rpart, B + ch);
        }
    }
}
