public class ContinuousSubArray {
    static void findSubArray(int arr[], int n) {
        System.out.println("enter array are: ");
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) { 
                sum = sum + arr[j];
                if (sum == n) {
                    for (int k = i; k <= j; k++) {
                        System.out.println(arr[k] + " ");
                    }
                    System.out.println(" ");
                } else if (sum > n) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 31, 9, 21, 8, 40, 5 };
        int n = 45;
        findSubArray(arr, n);
    }
}
