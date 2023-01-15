
public class MissingNum {
    public static void main(String[] args) {
        int num []= { 1, 2, 3, 4, 5, 6, 7, 9 };
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);
        for (int j = 1; j <= 9; j++) {
            sum2 = sum2 + j;
        }
        System.out.println(sum2);
        System.out.println(sum2 - sum);
    }
}
