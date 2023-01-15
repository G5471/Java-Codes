import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int arr1[] = { 8, 15, 6, 2, 1, 25, 20 };
        int arr2[] = { 8, 0, 9, 3, 6, 12, 55 };
        System.out.println("arr"+Arrays.toString(arr1));
        System.out.println("arr2"+Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(("commom array " + arr1[i]));
                }
            }
        }
    }
}
