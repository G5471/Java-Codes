public class LargestSumContiguous {
    public static int LargestSumContiguous(int arr[]) {
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i <= n - 1; i++) {
            currSum += arr[i];
            if (currSum > maxsum) {
                maxsum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, -2, 6, -8, 5 };
        System.out.println(LargestSumContiguous(arr));
    }
}
