// write a program to find all pairs of element in an integer array whose sum is equal to a given number.....
public class PairSumElement {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 7, 6, 3, 22, 11 };
        int sum = 9;
        pairSum(arr, sum);
    }

    public static void pairSum(int arr[], int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
