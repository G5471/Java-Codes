
public class PrimeNumberN {
    public static void main(String[] args) {
        String str = " ";
        int sum = 150;
        for (int i = 0; i <= sum; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                str = str + i + " ";
            }
        }
        System.out.println(str);
    }
}
