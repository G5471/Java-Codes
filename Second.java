public class Second {
    public static void main(String[] args) {
        int Arr[] = { 12, 35, 1, 10, 34, 1 };
        int len = Arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (Arr[i] > Arr[j]) {
                    int temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
        System.out.println(Arr[Arr.length - 2]);
    }
}
