public class CheckPrimeNumber {
    public static void main(String[] args) {
        int num = 7, count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
        if (count == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
    }
}
