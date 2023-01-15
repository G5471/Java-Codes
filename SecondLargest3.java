public class SecondLargest3 {
    public static void main(String[] args) {
        int arr[] = { 15, 97, 63, 52, 69, 88 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 2]);
    }
}
